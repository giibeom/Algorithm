package 배열1.형성평가1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strArr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strArr.add(i, scanner.next());
        }

        for (int i = (strArr.size()-1); i >= 0; i--) {
            System.out.print(strArr.get(i).trim() + " ");
        }

    }
}
