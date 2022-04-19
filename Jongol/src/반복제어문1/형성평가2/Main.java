package 반복제어문1.형성평가2;

import java.util.Scanner;

/**
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int odd = 0;
        int even = 0;

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            } else if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.printf("odd : %d\n", odd);
        System.out.printf("even : %d\n", even);
    }
}
