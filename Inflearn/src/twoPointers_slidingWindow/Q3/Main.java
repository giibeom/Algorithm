package twoPointers_slidingWindow.Q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 문제를 잘 이해하자 ㅠㅠ.... 내 1시간...
    // 연속으로 target일 동안 상승매출인것들 중에서 최대값인줄 알고 품
    // -> 실제 문제는 모든 연속된 target일에 대한 매출중 최대매출 구하기.
    public int solutionAtStupid(int day, int target, int[] sales) {
        int answer = 0;

        int count = 1;
        for (int i = 0; i < day; i++) {
            if (sales[i] < sales[i + 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count >= target) {
                int sum = sales[i - 1] + sales[i] + sales[i + 1];
                answer = Math.max(answer, sum);
            }
        }

        return answer;
    }

    public int solution(int day, int target, int[] sales) {
        int answer = 0;

        for (int i = 0; i <= day - target; i++) {
            int sum = 0;
            for (int j = 0; j < target; j++) {
                sum += sales[i + j];
            }
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    /*
        슬라이딩 윈도우 알고리즘
        1. 입력된 크기만큼의 윈도우(창문)을 지정해준다.
        2. 창문을 옆으로 한칸씩 미루면서 다음값 한개를 더하고, 왼쪽 끝의 벗어난 값을 빼준다
            2.1 일일히 중간값을 다시 구하려고 이중 for문을 사용할 필요가 없다
        3. 결국 for문 하나로만 가능
    * */

    public int solutionInLectureThroughtSlidingWindow(int day, int target, int[] sales) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < target; i++) {
            sum += sales[i];
        }

        answer = sum;

        for (int i = target; i < day; i++) {
            sum = (sum + sales[i] - sales[i - target]);
            Math.max(answer, sum);
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] sales = new int[day];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < day; i++) {
            sales[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solutionInLectureThroughtSlidingWindow(day, target, sales));
    }
}
