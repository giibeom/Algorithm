package 입력.형성평가4;

import java.util.Scanner;

/**
 * 세 개의 정수를 입력받아 합을 출력하는 프로그램을 작성하시오.
 * 20 50 100
 * sum = 170
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("sum = " + (a+b+c));

        scanner.close();
    }
}
