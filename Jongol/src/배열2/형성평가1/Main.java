package 배열2.형성평가1;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] scoreArr = new int[6];

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            scoreArr[num -1] += 1;
        }

        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(i+1 + " : " + scoreArr[i]);
        }

    }
}
