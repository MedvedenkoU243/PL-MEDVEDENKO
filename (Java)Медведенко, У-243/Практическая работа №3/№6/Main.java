import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество палочек (n): ");
        long n = scanner.nextLong();

        boolean isSashaTurn = true; 

        while (n > 0) {
            if (n % 2 == 0) {
                if (n / 2 > 1) {
                    n /= 2;
                } else {
                    n -= 1; // Берем 1 палочку
                }
            } else {
                n -= 1;
            }

            System.out.println((isSashaTurn ? "Саша" : "Таня") + " взял(а) палочку(и). Осталось палочек: " + n);
            isSashaTurn = !isSashaTurn;
        }

        System.out.println((isSashaTurn ? "Таня" : "Саша") + " выиграл(а)!");
        scanner.close();
    }
}
