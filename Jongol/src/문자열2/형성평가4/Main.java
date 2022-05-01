package 문자열2.형성평가4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> strArr = new ArrayList<String>();

        for (int i = 0; i < count; i++) {
            strArr.add(scanner.nextLine());
        }

        strArr.sort(Comparator.naturalOrder());

        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
