package 반복제어문2.형성평가10;

import java.util.Scanner;

/**
 * @author Created by 명기범 on 2022-04-19
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 0; j < Math.abs(a - b) + 1; j++) {
                    System.out.printf("%d * %d = %2d   ", a-j, i, (a-j)*i);
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                for (int j = 0; j < Math.abs(a - b) + 1; j++) {
                    System.out.printf("%d * %d = %2d   ", a+j, i, (a+j)*i);
                }
                System.out.println();
            }
        }

    }
}
