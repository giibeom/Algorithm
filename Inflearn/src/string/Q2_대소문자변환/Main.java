package string.Q2_대소문자변환;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solutionToForEach(String str) {
        String answer = "";

        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }

        return answer;
    }

    // 대문자는 65 ~ 90까지
    // 소문자는 97 ~ 122까지
    // 따라서 소문자에서 32빼면 대문자
    public String solutionToAscii(String str) {
        String answer = "";

        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (c >= 65 && c <= 90) {
                answer += (char)(c+32);
            } else if (c >= 97 && c <= 122){
                answer += (char)(c-32);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(main.solutionToAscii(str));
    }
}
