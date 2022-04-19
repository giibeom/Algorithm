package 반복제어문3.형성평가1;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        for (int i = 0; i < 20; i++) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            } else {
                sum += num;
                count++;
            }
        }

        System.out.print((int)sum + " " + (int)(sum/count));
    }
}
