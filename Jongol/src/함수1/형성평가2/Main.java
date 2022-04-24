package 함수1.형성평가2;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        printTotalSum(num);
    }

    private static void printTotalSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
