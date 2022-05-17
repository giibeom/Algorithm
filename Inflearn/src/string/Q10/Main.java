package string.Q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public String solution(String target, String c) {
        String answer = "";

        String[] split = target.split("");

        for (String s : split) {

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String target = st.nextToken();
        String c = st.nextToken();
        System.out.println(main.solution(target, c));
    }
}
