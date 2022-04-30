package 문자열1.형성평가7;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] s = str.split(" ");

        int i = 1;
        for (String result : s) {
            System.out.printf("%d. %s\n", i, result);
            i++;
        }

    }
}
