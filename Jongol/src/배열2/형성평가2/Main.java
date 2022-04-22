package 배열2.형성평가2;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scoreArr = new int[11];

        while (true) {
            int score = scanner.nextInt();

            if (score == 0) {
                break;
            } else {
                scoreArr[score / 10] += 1;
            }
        }


        for (int i = 10; i >=  0; i--) {
            if (scoreArr[i] != 0) {
                System.out.println(((i) * 10) + " : " + scoreArr[i] + " person");
            }
        }

    }
}
