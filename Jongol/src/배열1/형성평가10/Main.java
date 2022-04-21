package 배열1.형성평가10;

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

        ArrayList<Integer> scoreList = new ArrayList<Integer>();

        for (int i = 0; i < count; i++) {
            scoreList.add(scanner.nextInt());
        }

        scoreList.sort(Comparator.reverseOrder());

        for (Integer score : scoreList) {
            System.out.println(score);
        }
    }
}
