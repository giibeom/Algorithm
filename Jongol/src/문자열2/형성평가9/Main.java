package 문자열2.형성평가9;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String b = String.format("%.3f", scanner.nextDouble());
        String c = scanner.next();

        String result = a + "" + b + c;

        if (result.length() % 2 == 0) {
            System.out.println(result.substring(0, (result.length() / 2)));
            System.out.println(result.substring(result.length() / 2));
        } else {
            System.out.println(result.substring(0, result.length() / 2 + 1));
            System.out.println(result.substring(result.length() / 2 + 1));
        }
    }
}
