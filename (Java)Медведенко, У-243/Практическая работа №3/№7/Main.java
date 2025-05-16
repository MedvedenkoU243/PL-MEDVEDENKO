import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество палочек (n): ");
        long n = scanner.nextLong();

        long tanyaSticks = 0;
        boolean isTanyaTurn = true;

        while (n > 0) {
            if (isTanyaTurn) {
                if (n % 2 == 0) {
                    n -= 1;
                } else {
                    n -= 1;
                }
                tanyaSticks++;
            } else {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n -= 1;
                }
            }
            isTanyaTurn = !isTanyaTurn;
        }

        System.out.println("Количество палочек у Тани: " + tanyaSticks);
        scanner.close();
    }
}
