package 반복제어문2.형성평가8;

import java.util.Scanner;

/**
 * @author Created by 명기범 on 2022-04-19
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int column = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }

    }
}
