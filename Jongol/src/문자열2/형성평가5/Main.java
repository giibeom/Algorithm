package 문자열2.형성평가5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> strArr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strArr.add(scanner.nextLine());
        }

        String validate1 = scanner.nextLine();
        String validate2 = scanner.nextLine();

        int count = 0;

        for (String str : strArr) {
            if (str.indexOf(validate1) >= 0 || str.indexOf(validate2) >= 0) {
                System.out.println(str);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("none");
        }
    }
}
