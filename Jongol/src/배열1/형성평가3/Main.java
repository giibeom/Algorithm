package 배열1.형성평가3;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int odd = 0;
        int even = 0;

        for (int i = 1; i <= 10; i++) {
            int num = scanner.nextInt();

            if (i % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);

    }
}
