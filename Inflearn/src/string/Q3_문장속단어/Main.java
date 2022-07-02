package string.Q3_문장속단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public String solution(StringTokenizer st) {
        String answer = "";

        while (st.hasMoreTokens()) {
            String tempStr = st.nextToken();
            if (answer.length() < tempStr.length()) {
                answer = tempStr;
            }
        }

        return answer;
    }

    public String solutionToIndexOfAndSubString(String str) {
        String answer = "";

        int maxLength = Integer.MIN_VALUE;
        int pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > maxLength) {
                maxLength = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        if (str.length() > maxLength) {
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        System.out.println(main.solution(st));
    }
}
