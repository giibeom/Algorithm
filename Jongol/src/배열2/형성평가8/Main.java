package 배열2.형성평가8;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numArr = new int[4][2];

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                numArr[i][j] = scanner.nextInt();
            }
        }


        int[] horizontalSum = new int[4];
        int[] lengthSum = new int[2];
        int totalSum = 0;

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                horizontalSum[i] += numArr[i][j];
                totalSum += numArr[i][j];
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                lengthSum[i] += numArr[j][i];
            }
        }

        for (int i = 0; i < horizontalSum.length; i++) {
            System.out.print(horizontalSum[i]/2 + " ");
        }

        System.out.println();

        for (int i = 0; i < lengthSum.length; i++) {
            System.out.print(lengthSum[i]/4 + " ");
        }

        System.out.println();

        System.out.println(totalSum/8);

    }
}
