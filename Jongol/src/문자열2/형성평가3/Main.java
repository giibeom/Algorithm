package 문자열2.형성평가3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> strArr = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            strArr.add(input);
        }

        System.out.println(strArr.size());
        int i = 1;
        for (String str : strArr) {
            if (i % 2 != 0) {
                System.out.println(str);
            }
            i++;
        }
    }
}
