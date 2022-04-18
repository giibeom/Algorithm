package 선택제어문.형성평가5;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        if (month < 8) {
            if (month == 2) {
                System.out.println("28");
            } else if (month % 2 != 0) {
                System.out.println("31");
            } else {
                System.out.println("30");
            }
        } else {
            if (month % 2 == 0) {
                System.out.println("31");
            } else {
                System.out.println("30");
            }
        }
    }
}
