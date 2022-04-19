package 반복제어문2.형성평가6;

import java.util.Scanner;

/**
 * @author Created by 명기범 on 2022-04-19
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double sum = 0;
        int count = 0;

        if (a > b) {
            for (int i = b; i <= a; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                    count++;
                }
            }
        } else {
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                    count++;
                }
            }
        }

        System.out.println("sum : " + (int) sum);
        System.out.printf("avg : %.1f", sum/count);
    }
}
