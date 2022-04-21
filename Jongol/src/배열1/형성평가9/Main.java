package 배열1.형성평가9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            } else if (num % 2 == 0) {
                numList.add(num/2);
            } else {
                numList.add(num*2);
            }
        }

        System.out.println(numList.size());
        for (Integer num : numList) {
            System.out.print(num + " ");
        }
    }
}
