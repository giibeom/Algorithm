package 문자열2.형성평가8;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String str = scanner.nextLine();

            if (str.equals("END")) {
                break;
            } else {

                String[] strArr = str.split("");
                for (int i = strArr.length - 1; i >= 0; i--) {
                    System.out.print(strArr[i]);
                }
                System.out.println();
            }
        }

    }
}
