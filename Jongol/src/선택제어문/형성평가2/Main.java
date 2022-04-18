package 선택제어문.형성평가2;

import java.util.Scanner;

/**
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("plus");
        } else if (a == 0) {
            System.out.println("zero");
        } else {
            System.out.println("minus");
        }

        scanner.close();
    }
}
