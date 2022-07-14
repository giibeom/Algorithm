package 반복문.Q10871;

import java.util.Scanner;

public class Main {

    public String solution(int x, int[] numArr) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] < x) {
                answer.append(numArr[i] + " ");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }

        System.out.println(main.solution(x, numArr));
    }
}
