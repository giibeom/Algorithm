package 반복제어문3.형성평가2;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {
            int result = num * i;

            if (result > 100) {
                break;
            } else {
                System.out.print(result + " ");

                if (result % 10 == 0) {
                    break;
                }
            }
        }

    }
}
