package 함수3.형성평가2;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num % 2 == 0) {
            printRecursive(num, 2);
        } else {
            printRecursive(num, 1);
        }
    }

    private static void printRecursive(int num, int index) {

        System.out.print(index + " ");

        if (index == num) {
            return;
        }

        index += 2;
        printRecursive(num, index);
    }
}
