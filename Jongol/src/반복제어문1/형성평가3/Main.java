package 반복제어문1.형성평가3;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;

        while (true) {
            int num = scanner.nextInt();

            if (num > 100 || num < 0) {
                break;
            } else {
                sum = sum + num;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("sum : 0");
            System.out.println("avg : 0");
        } else {
            double avg = sum / count;
            System.out.printf("sum : %d\n", Math.round(sum));
            System.out.printf("avg : %.1f", avg);
        }
    }
}
