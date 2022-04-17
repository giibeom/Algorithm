package 디버깅.형성평가1;

import java.util.Scanner;

/**
 * @author Created by 명기범 on 2022-04-18
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();

        double sum = subject1 + subject2 + subject3;

        System.out.printf("%.1f", (sum/3));

        scanner.close();
    }
}
