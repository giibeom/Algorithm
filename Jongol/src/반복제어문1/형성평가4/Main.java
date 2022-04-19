package 반복제어문1.형성평가4;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                if (num % 3 == 0 || num % 5 == 0) {
                    continue;
                } else {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}