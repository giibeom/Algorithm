package 문자열1.형성평가3;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String rgx = "[^a-zA-Z0-9]";
        str = str.replaceAll(rgx, "").toLowerCase();
        System.out.println(str);

/*        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (isPrint(c)) {
                System.out.print(c);
            }
        }*/

    }

    private static Boolean isPrint(char c) {
        if (c >= 48 && c <= 57) {
            return true;
        } else if (c >= 65 && c <= 90) {
            return true;
        } else if (c >= 97 && c <= 122) {
            return true;
        } else {
            return false;
        }
    }
}
