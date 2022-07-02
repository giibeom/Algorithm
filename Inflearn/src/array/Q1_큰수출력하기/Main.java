package array.Q1_큰수출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(int count, String str) {
        StringBuilder answer = new StringBuilder();
        String[] split = str.split(" ");
        answer.append(split[0] + " ");

        for (int i = 1; i < split.length; i++) {
            if (Integer.parseInt(split[i]) > Integer.parseInt(split[i-1])) {
                answer.append(split[i] + " ");
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.println(main.solution(count, str));
    }
}
