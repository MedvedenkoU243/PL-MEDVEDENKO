import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int firstNum = scanner.nextInt();
        System.out.println("Введите второе число ");
        int secondNum = scanner.nextInt();
        int start = Math.min(firstNum, secondNum);
        int step = start;
    
        System.out.println("Квадраты чисел: ");
        for (int i = start; i <= start + 4 * step; i += step) {
            System.out.println((i*i) + (i< start + 4 * step ? ",": ""));
        }
    }
}