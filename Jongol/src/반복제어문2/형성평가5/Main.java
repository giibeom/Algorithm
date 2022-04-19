package 반복제어문2.형성평가5;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < 10; i++) {
            int inputNum = scanner.nextInt();

            if (inputNum % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("even : " + evenCount);
        System.out.println("odd : " + oddCount);

    }
}
