package 문자열2.형성평가6;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        int count = scanner.nextInt();

        a = a + b;

        String copy;
        if (count > a.length() - 1) {
            copy = a;
        } else {
            copy = a.substring(0, count);
        }

        if (count > b.length() - 1) {
            b = copy;
        } else {
            b = b.replace(b.substring(0, count), copy);
        }

        System.out.println(a);
        System.out.println(b);
    }
}
