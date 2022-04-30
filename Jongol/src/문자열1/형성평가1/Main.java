package 문자열1.형성평가1;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);

        System.out.print(a + b + " ");
        System.out.print(Math.abs(a - b));
    }
}
