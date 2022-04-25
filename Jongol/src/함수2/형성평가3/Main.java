package 함수2.형성평가3;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += Math.abs(scanner.nextInt());
        }

        System.out.println(sum);
    }
}
