public class Main {

    public static void main(String[] args) {
        System.out.println(isPossible(89, 1)); // true
        System.out.println(isPossible(695, 2)); // true
        System.out.println(isPossible(123, 2)); // false
    }

    public static boolean isPossible(int number, int startExponent) {
        String numStr = String.valueOf(number);
        int powerSum = 0;

        // Считаем сумму степеней цифр
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            powerSum += Math.pow(digit, startExponent + i);
        }

        // Проверяем произведение с множителями 2^6, 2^7, ...
        int multiplier = 64; // 2^6
        while (multiplier <= powerSum) {
            if (powerSum == number * (multiplier / 64)) {
                return true;
            }
            multiplier *= 2; // Увеличиваем множитель на следующий степень двойки
        }

        return false; // Если не нашли подходящее произведение
    }
}
