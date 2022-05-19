package string.Q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        String[] split = str.split("");
        int count = 1;
        String preChar = "";

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals(preChar)) {
                count++;
            } else {
                if (count > 1) {
                    answer.append(count);
                }
                answer.append(split[i]);
                preChar = split[i];
                count = 1;
            }
        }

        if (count > 1) {
            answer.append(count);
        }
        return answer.toString();
    }

    public String solutionInLecture(String str) {
        String answer = "";
        str = str + " ";
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i + 1);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(main.solution(br.readLine()));
    }
}
