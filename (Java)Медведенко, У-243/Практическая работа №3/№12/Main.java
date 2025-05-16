import java.util.*;

class Main {
	   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        String transformedText = transformText(inputText);

        System.out.println("Изменённый текст:");
        System.out.println(transformedText);
    }

    public static String transformText(String inputText) {
        String[] words = inputText.split("(?=[\\p{Punct}\\s])|(?<=[\\p{Punct}\\s])");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.matches("[a-zA-Zа-яА-ЯёЁ]+")) {
                String transformedWord = word.substring(1) + word.charAt(0) + "ауч";
                result.append(transformedWord);
            } else {
                result.append(word);
            }
        }
        return result.toString();
    }
}
