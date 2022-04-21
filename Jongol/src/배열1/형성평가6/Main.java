package 배열1.형성평가6;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strArr = {"J", "U", "N", "G", "O", "L"};

        String str = scanner.next();
        String result = "none";

        for (int i = 0; i < strArr.length; i++) {
            if (str.equals(strArr[i])) {
                result = i + "";
            }
        }

        System.out.println(result);
    }
}
