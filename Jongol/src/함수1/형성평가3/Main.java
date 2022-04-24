package 함수1.형성평가3;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        printPascalByNum(num);
    }

    private static void printPascalByNum(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
