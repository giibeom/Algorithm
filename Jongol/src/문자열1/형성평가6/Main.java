package 문자열1.형성평가6;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuffer str = new StringBuffer();
        str.append(scanner.nextLine());

        removeAndPrint(scanner, str);
    }

    private static void removeAndPrint(Scanner scanner, StringBuffer str) {

        if (str.length() == 1) {
            return;
        }

        int removeIndex = scanner.nextInt();

        if (str.length() < removeIndex) {
            str.deleteCharAt(str.length() - 1);
        } else {
            str.deleteCharAt(removeIndex - 1);
        }

        System.out.println(str);

        removeAndPrint(scanner, str);
    }
}
