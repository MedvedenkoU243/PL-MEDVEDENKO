import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества игроков
        System.out.print("Введите количество игроков: ");
        int numberOfPlayers = scanner.nextInt();

        // Ввод номера игрока, с которого начинается игра
        System.out.print("Введите номер игрока, с которого начинается игра: ");
        int startPlayer = scanner.nextInt();

        // Список игроков
        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add(i);
        }

        List<Integer> eliminatedPlayers = new ArrayList<>(); // Список выбывших игроков
        int index = startPlayer - 1; // Индекс игрока, с которого начинается игра

        // Выводим начальную последовательность
        System.out.println(players + " - initial sequence");

        // Играем до тех пор, пока не останется один игрок
        while (players.size() > 1) {
            // Находим индекс игрока, который выбывает
            index = (index + 2) % players.size(); // Каждый третий (текущий + 2)
            int eliminatedPlayer = players.get(index); // Игрок, который выбывает
            eliminatedPlayers.add(eliminatedPlayer); // Добавляем выбывшего игрока в список
            players.remove(index); // Удаляем игрока из списка

            // Выводим текущее состояние
            System.out.println(players + " => " + eliminatedPlayer + " is counted out and goes into the result " + eliminatedPlayers);
        }

        // Последний оставшийся игрок
        int winner = players.get(0);
        eliminatedPlayers.add(winner); // Добавляем победителя в список выбывших

        // Выводим финальный результат
        System.out.println("[] => " + winner + " is counted out and goes into the result " + eliminatedPlayers);
        System.out.println("Final result: " + eliminatedPlayers);

        scanner.close();
    }
}
