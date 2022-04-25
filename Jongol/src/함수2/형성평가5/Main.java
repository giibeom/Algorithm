package 함수2.형성평가5;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println(Math.round((a + b + c) / 3));

        System.out.println(Math.round((Math.round(a) + Math.round(b) + Math.round(c)) / 3));

    }
}
