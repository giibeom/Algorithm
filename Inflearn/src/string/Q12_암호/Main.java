package string.Q12_암호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public char[] solution(int charLength, String str) {
        char[] answer = new char [charLength];;

        str = str.replace("#", "1");
        str = str.replace("*", "0");

        for (int i = 0; i < charLength; i++) {
            answer [i] = (char) Integer.parseInt(str.substring(i * 7, i * 7 + 7), 2);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int charLength = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (char c : main.solution(charLength, str)) {
            System.out.print(c);
        }
    }
}
