package 함수2.형성평가2;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Math.sqrt(scanner.nextDouble());
        double num2 = Math.sqrt(scanner.nextDouble());

        if (num1 > num2) {
            System.out.println((int)(Math.floor(num1) - Math.ceil(num2) + 1));
        } else if (num1 < num2) {
            System.out.println((int)(Math.floor(num2) - Math.ceil(num1) + 1));
        } else {
            System.out.println(1);
        }
    }
}
