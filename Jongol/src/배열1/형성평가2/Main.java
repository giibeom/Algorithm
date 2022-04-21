package 배열1.형성평가2;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            int num = scanner.nextInt();

            if (i % 2 != 0) {
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
