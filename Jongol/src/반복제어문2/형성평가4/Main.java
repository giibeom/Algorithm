package 반복제어문2.형성평가4;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        double sum = 0;

        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            sum += scanner.nextInt();
        }

        System.out.printf("%.2f", sum/count);

        scanner.close();
    }
}
