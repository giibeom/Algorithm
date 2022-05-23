package array.Q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int[] solution(int row) {

        int[] answer = new int[row];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < answer.length; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(br.readLine());

        for (int num : main.solution(row)) {
            System.out.print(num + " ");
        }
    }
}
