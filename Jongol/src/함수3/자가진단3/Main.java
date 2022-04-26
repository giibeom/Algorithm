package 함수3.자가진단3;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        printSumByRecursive(num, 1, 0);

    }

    private static void printSumByRecursive(int num, int index, int sum) {

        sum += index;

        if (index == num) {
            System.out.println(sum);
            return;
        }

        index++;
        printSumByRecursive(num, index, sum);
    }
}
