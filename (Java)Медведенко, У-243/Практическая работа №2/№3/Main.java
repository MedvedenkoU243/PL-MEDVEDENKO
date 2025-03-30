import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String string = scanner.nextLine();
        String changedString1 = string.replaceAll("[aeiouAEIOU]", "");
        String changedString2 = changedString1.replaceAll("[аеёийоуыэюяАЕЁИЙОУЫЭЮЯ]", "");
        System.out.println("Строка без гласных: " + changedString2);
   }
}