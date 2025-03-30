import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите первую строку ");
       String first = scanner.nextLine();
       System.out.println("Введите вторую строку ");
       String second = scanner.nextLine();
       boolean result = first.endsWith(second);
       System.out.println(result);
   }
}