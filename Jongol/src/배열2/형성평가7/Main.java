package 배열2.형성평가7;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] numArr1 = new int[2][3];
        int[][] numArr2 = new int[2][3];

        System.out.println("first array");
        for (int i = 0; i < numArr1.length; i++) {
            for (int j = 0; j < numArr1[i].length; j++) {
                numArr1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("second array");
        for (int i = 0; i < numArr2.length; i++) {
            for (int j = 0; j < numArr2[i].length; j++) {
                numArr2[i][j] = scanner.nextInt();
            }
        }

        int[][] resultArr = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                resultArr[i][j] = numArr1[i][j] * numArr2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
