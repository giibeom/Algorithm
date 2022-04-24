package 함수1.형성평가4;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double result = getResult(a, b);

        System.out.println((int)result);
    }

    private static double getResult(int a, int b) {
        return Math.abs(Math.pow(a, 2) - Math.pow(b, 2));
    }
}
