package 반복제어문2.형성평가3;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            if (i % 5 ==0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
