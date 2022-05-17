package string.Q9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(String str) {
        int answer = 0;

        str = str.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(str);

        return answer;
    }

    /*
         tge0a1h205er
         answer = answer * 10 + (x-48)
         0 = 0 x 10 + 0
         1 = 0 x 10 + 1
         12 = 1 x 10 + 2
         120 = 12 x 10 + -
         1205 = 120 x 10 + 5
     */
    public int solutionInLectureThroughCharAscii(String str) {
        int answer = 0;

        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }

        return answer;
    }

    public int solutionInLectureThroughisDigit(String str) {
        StringBuilder answer = new StringBuilder();

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                answer.append(x);
            }
        }
        return Integer.parseInt(answer.toString());
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(main.solutionInLectureThroughisDigit(br.readLine()));
    }
}
