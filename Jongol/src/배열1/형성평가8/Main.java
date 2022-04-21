package 배열1.형성평가8;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        for (int i = 0; i < 100; i++) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            } else {
                if (num % 5 == 0) {
                    sum += num;
                    count++;
                }
            }
        }

        System.out.println("Multiples of 5 : " + count);
        System.out.println("sum : " + (int) sum);
        System.out.printf("avg : %.1f", sum / count);
    }
}
