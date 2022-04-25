package 함수2.형성평가1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        ArrayList<Integer> numArr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            numArr.add(scanner.nextInt());
        }

        numArr.sort(Collections.reverseOrder());

        for (Integer result : numArr) {
            System.out.print(result + " ");
        }

    }
}
