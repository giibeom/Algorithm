package string.Q5_특정문자뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

a#b!GE*T@S -> S#T!EG*b@a

*/

public class Main {
    public String solution(String str) {
        String answer = "";

        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            if (Character.isLetter(chars[lt]) && Character.isLetter(chars[rt])) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            } else if (!Character.isLetter(chars[lt])) {
                lt++;
            } else if (!Character.isLetter(chars[rt])) {
                rt--;
            }
        }

        answer = String.valueOf(chars);

        return answer;
    }

    public String solutionToLecture(String str) {
        String answer = "";

        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(chars);

        return answer;
    }

    public String test(String str) {
        String answer = "";
        String[] strArr = str.split("");
        int lt = 0;
        int rt = strArr.length - 1;
        while (lt < rt) {
            boolean isLtAlphabet = strArr[lt].matches("[a-zA-Z]");
            boolean isRtAlphabet = strArr[rt].matches("[a-zA-Z]");

            if (isLtAlphabet && isRtAlphabet) {
                String tmp = strArr[lt];
                strArr[lt] = strArr[rt];
                strArr[rt] = tmp;
                lt++;
                rt--;
            } else if (!isLtAlphabet) {
                lt++;
            } else {
                rt--;
            }
        }
        answer = String.join("", strArr);

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(main.test(br.readLine()));
    }
}
