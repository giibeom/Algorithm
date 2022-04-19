package 반복제어문2.형성평가9;

import java.util.Scanner;

/**
 * @author Created by 명기범 on 2022-04-19
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.printf("(%d, %d) ", i, j);
            }
            System.out.println();
        }
    }
}
