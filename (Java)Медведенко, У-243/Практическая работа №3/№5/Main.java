import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int i = 10; // Замените на нужное значение i в диапазоне от 10 до 100000
        long fibonacciNumber = fibonacci(i);
        System.out.println("F(" + i + ") = " + fibonacciNumber);
        System.out.println("Наибольшее вхождение цифры: " + findMostFrequentDigit(fibonacciNumber));
    }

    // Метод для вычисления i-го числа Фибоначчи
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int j = 2; j <= n; j++) {
            fib[j] = fib[j - 1] + fib[j - 2];
        }

        return fib[n];
    }

    // Метод для нахождения наибольшего вхождения цифры
    public static String findMostFrequentDigit(long number) {
        String numStr = String.valueOf(number);
        Map<Character, Integer> digitCount = new HashMap<>();

        // Подсчет вхождений каждой цифры
        for (char digit : numStr.toCharArray()) {
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
        }

        // Поиск цифры с максимальным количеством вхождений
        char mostFrequentDigit = '0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : digitCount.entrySet()) {
            char digit = entry.getKey();
            int count = entry.getValue();

            // Если текущее количество больше максимального или
            // если количество равно максимальному, но цифра меньше
            if (count > maxCount || (count == maxCount && digit < mostFrequentDigit)) {
                mostFrequentDigit = digit;
                maxCount = count;
            }
        }

        return String.format("(%d, %c)", maxCount, mostFrequentDigit);
    }
}