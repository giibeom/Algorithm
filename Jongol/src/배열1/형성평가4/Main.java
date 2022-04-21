package 배열1.형성평가4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            } else {
                numList.add(num);
            }
        }

        if (numList.size() < 3) {
            for (Integer num : numList) {
                System.out.print(num + " ");
            }
        } else {
            for (int i = numList.size() - 3; i <= numList.size() - 1; i++) {
                System.out.print(numList.get(i) + " ");
            }
        }
    }
}
