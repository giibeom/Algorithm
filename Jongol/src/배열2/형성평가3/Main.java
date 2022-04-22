package 배열2.형성평가3;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = new int[10];
        numArr[0] = scanner.nextInt();
        numArr[1] = scanner.nextInt();

        for (int i = 2; i < numArr.length; i++) {
            numArr[i] = (numArr[i-2] + numArr[i-1])%10;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
}
