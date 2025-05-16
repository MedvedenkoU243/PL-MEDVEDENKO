import java.util.Scanner;

public class Main {

    public static String caesarCipher(String text, int shift, String direction) {
        StringBuilder result = new StringBuilder();

        // Определяем, в какую сторону сдвигать
        if (direction.equalsIgnoreCase("left")) {
            shift = -shift;
        }

        // Обрабатываем каждый символ в строке
        for (char character : text.toCharArray()) {
            // Проверяем, является ли символ буквой
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                // Сдвигаем символ и обрабатываем переполнение
                char shiftedChar = (char) ((character - base + shift + 26) % 26 + base);
                result.append(shiftedChar);
            } else {
                // Если это не буква, добавляем символ без изменений
                result.append(character);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        // Ввод сдвига
        System.out.print("Введите число сдвига: ");
        int shift = scanner.nextInt();

        // Ввод направления
        System.out.print("Введите направление (left/right): ");
        String direction = scanner.next();

        // Применение шифрования
        String encryptedText = caesarCipher(text, shift, direction);

        // Вывод результата
        System.out.println("Зашифрованный текст: " + encryptedText);

        scanner.close();
    }
}
