package 함수3.형성평가1;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        printRecursive(num);

    }

    private static void printRecursive(int num) {

        if (num == 1) {
            System.out.print(num + " ");
            return;
        }

        printRecursive(num / 2);

        System.out.print(num + " ");
    }
}
