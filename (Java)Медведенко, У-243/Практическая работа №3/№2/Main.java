import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n (0 < n < 100000): ");
        int n = scanner.nextInt();

        // Проверка на допустимость n
        if (n <= 0 || n >= 100000) {
            System.out.println("Число должно быть в диапазоне (0, 100000).");
            return;
        }

        // Проверка на четность
        if (n % 2 == 0) {
            System.out.println("Разница между квадратами двух последовательных чисел должна быть нечетной.");
        } else {
            int k = (n - 1) / 2;
            int firstSquare = k * k;
            int secondSquare = (k + 1) * (k + 1);

            System.out.println("Первое квадратное число: " + firstSquare);
            System.out.println("Второе квадратное число: " + secondSquare);
            System.out.println("Разница: " + (secondSquare - firstSquare));
        }

        scanner.close();
    }
}