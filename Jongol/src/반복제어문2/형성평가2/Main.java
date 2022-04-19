package 반복제어문2.형성평가2;

import java.util.Scanner;

/**
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            int count = a - b;
            output(b, count);
        } else {
            int count = b - a;
            output(a, count);
        }

        scanner.close();
    }

    private static void output(int start, int count) {
        for (int i = 0; i <= count; i++) {
            System.out.print((start + i + " "));
        }
    }
}
