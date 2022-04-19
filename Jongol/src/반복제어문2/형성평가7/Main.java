package 반복제어문2.형성평가7;

import java.util.Scanner;

/**
 * @author Created by 명기범 on 2022-04-19
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
    }
}
