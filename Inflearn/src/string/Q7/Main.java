package string.Q7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public boolean solution(String str) {

        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            char tmp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = tmp;
            lt++;
            rt--;
        }
        String reverseStr = String.valueOf(chars);

        return str.equalsIgnoreCase(reverseStr);
    }

    public String solutionInLectureThroughCharAt(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                answer = "NO";
                return answer;
            }
        }

        return answer;
    }

    public String solutionInLectureThroughReverse(String str) {
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/*        if (main.solution(br.readLine())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }*/

//        System.out.println(main.solutionInLectureThroughCharAt(br.readLine()));
        System.out.println(main.solutionInLectureThroughReverse(br.readLine()));
    }
}
