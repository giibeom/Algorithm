package 배열2.형성평가10;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] strArray = new String[3][5];

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                strArray[i][j] = scanner.next().toLowerCase();
            }
        }

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                System.out.print(strArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
