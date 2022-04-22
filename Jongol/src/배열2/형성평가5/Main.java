package 배열2.형성평가5;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scoreAr = new int[4];

        for (int i = 0; i < scoreAr.length; i++) {
            int sum = 0;
            System.out.print(i+1 + "class? ");
            for(int j = 0; j < 3; j++) {
                sum += scanner.nextInt();
            }
            scoreAr[i] = sum;
            System.out.println();
        }

        for (int i = 0; i < scoreAr.length; i++) {
            System.out.println(i+1 + "class : " + scoreAr[i]);
        }

    }
}
