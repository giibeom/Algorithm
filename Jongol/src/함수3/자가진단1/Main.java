package 함수3.자가진단1;

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

        if (num == 0) {
            return;
        }

        System.out.println("recursive");

        printRecursive(num - 1);
    }
}
