package 문자열1.형성평가4;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String find = scanner.next();
        int i = str.indexOf(find);

        if (i == -1) {
            System.out.println("No");
        } else {
            System.out.println(i + "");
        }

    }
}
