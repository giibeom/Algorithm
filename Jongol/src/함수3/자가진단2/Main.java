package 함수3.자가진단2;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        printNumByRecursive(num);

    }

    private static void printNumByRecursive(int num) {
        if (num == 0) {
            return;
        }

        System.out.print(num + " ");

        printNumByRecursive(num - 1);
    }
}
