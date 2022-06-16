package 조건문.Q2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstNum = Integer.parseInt(st.nextToken());
        int secondNum = Integer.parseInt(st.nextToken());
        int thirdNum = Integer.parseInt(st.nextToken());

        System.out.println(solution(firstNum, secondNum, thirdNum));
    }

    private static int solution(int firstNum, int secondNum, int thirdNum) {
        int answer = 0;
        if (firstNum == secondNum && firstNum == thirdNum) {
            answer = 10000 + firstNum * 1000;
        } else if (firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum) {
            int maxNum = Math.max(Math.max(firstNum, secondNum), thirdNum);
            answer = maxNum * 100;
        } else {
            // 1,000원+(같은 눈)×100
            if (firstNum == secondNum || firstNum == thirdNum) {
                answer = 1000 + firstNum * 100;
            } else {
                answer = 1000 + secondNum * 100;
            }
        }

        return answer;
    }
}
