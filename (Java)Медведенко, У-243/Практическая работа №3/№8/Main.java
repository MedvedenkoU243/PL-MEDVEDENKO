import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите веса через пробел: ");
        String input = scanner.nextLine();

        String[] weightsStr = input.split(" ");
        List<Integer> weights = new ArrayList<>();

        for (String weightStr : weightsStr) {
            weights.add(Integer.parseInt(weightStr));
        }

        Collections.sort(weights, new Comparator<Integer>() {
            @Override
            public int compare(Integer w1, Integer w2) {
                int sum1 = sumOfDigits(w1);
                int sum2 = sumOfDigits(w2);
                
                if (sum1 != sum2) {
                    return Integer.compare(sum1, sum2);
                } else {
                    return Integer.compare(w2, w1);
                }
            }

            private int sumOfDigits(int weight) {
                int sum = 0;
                while (weight > 0) {
                    sum += weight % 10;
                    weight /= 10;
                }
                return sum;
            }
        });

        System.out.println("Отсортированный список:");
        for (Integer weight : weights) {
            System.out.print(weight + " ");
        }
        System.out.println();

        scanner.close();
    }
}
