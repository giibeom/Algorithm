package 문자열2.형성평가2;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = {"flower", "rose", "lily", "daffodil", "azalea"};

        String input = scanner.next();
        int count = 0;
        for (String str : strArr) {
            if (str.indexOf(input,1) == 1 || str.indexOf(input,1) == 2) {
                System.out.println(str);
                count++;
            }
        }

        System.out.println(count);
    }
}
