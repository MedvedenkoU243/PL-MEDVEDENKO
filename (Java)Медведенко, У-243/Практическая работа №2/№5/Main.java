import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число ");
        int secondNum = scanner.nextInt();
        System.out.println("Введите третье число ");
        int thirdNum = scanner.nextInt();
        int start = firstNum;
        int step = secondNum;
        int quantitySteps = thirdNum;

        for (int i = 0; i <= quantitySteps; i++) {
            int currentNum = start + i * step;
            System.out.println(currentNum + (i < quantitySteps - 1 ? ",": ""));
        }
    }
}