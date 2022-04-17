package 연산자.형성평가5;

import java.util.Scanner;

/**
 * 민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
 *
 * (JAVA는 1 이면 true, 0 이면 false를 출력한다.)
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minsuHeight = scanner.nextInt();
        int minsuWeight = scanner.nextInt();
        scanner.nextLine();

        int giyoungHeight = scanner.nextInt();
        int giyoungWeight = scanner.nextInt();

        System.out.println(isMinsuWinner(minsuHeight, minsuWeight, giyoungHeight, giyoungWeight));

        scanner.close();
    }

    private static boolean isMinsuWinner(int minsuHeight, int minsuWeight, int giyoungHeight, int giyoungWeight) {
        return minsuHeight > giyoungHeight && minsuWeight > giyoungWeight;
    }
}
