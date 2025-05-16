import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int CODE_LENGTH = 4; // Длина кода
    private static final int MAX_ATTEMPTS = 20; // Максимальное количество попыток

    public static void main(String[] args) {
        int[] secretCode = generateSecretCode();
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        System.out.println("Добро пожаловать в игру 'Разгадай код'!");
        System.out.println("Загаданный код состоит из " + CODE_LENGTH + " чисел от 0 до 9.");
        System.out.println("Попробуйте угадать код за менее чем " + MAX_ATTEMPTS + " попыток.");

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Введите 4 числа (через пробел): ");
            String input = scanner.nextLine();
            String[] inputNumbers = input.split(" ");

            // Проверка на корректность ввода
            if (inputNumbers.length != CODE_LENGTH) {
                System.out.println("Пожалуйста, введите ровно 4 числа.");
                continue;
            }

            int[] guess = new int[CODE_LENGTH];
            try {
                for (int i = 0; i < CODE_LENGTH; i++) {
                    guess[i] = Integer.parseInt(inputNumbers[i]);
                    if (guess[i] < 0 || guess[i] > 9) {
                        throw new NumberFormatException();
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, вводите только числа от 0 до 9.");
                continue;
            }

            attempts++;
            int matches = countMatches(secretCode, guess);

            if (matches == CODE_LENGTH) {
                System.out.println("Поздравляю! Вы угадали код: " + arrayToString(secretCode) + " за " + attempts + " попыток!");
                break;
            } else {
                System.out.println("Совпадений: " + matches + ". Попробуйте снова.");
            }
        }

        if (attempts == MAX_ATTEMPTS) {
            System.out.println("Вы исчерпали все попытки. Загаданный код был: " + arrayToString(secretCode));
        }

        scanner.close();
    }

    // Метод для генерации секретного кода
    private static int[] generateSecretCode() {
        Random random = new Random();
        int[] code = new int[CODE_LENGTH];
        for (int i = 0; i < CODE_LENGTH; i++) {
            code[i] = random.nextInt(10); // Генерируем число от 0 до 9
        }
        return code;
    }

    // Метод для подсчета совпадений
    private static int countMatches(int[] secretCode, int[] guess) {
        int count = 0;
        for (int i = 0; i < CODE_LENGTH; i++) {
            for (int j = 0; j < CODE_LENGTH; j++) {
                if (secretCode[i] == guess[j]) {
                    count++;
                    break; // Выходим из внутреннего цикла, чтобы не считать одинаковые числа
                }
            }
        }
        return count;
    }

    // Метод для преобразования массива в строку
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
