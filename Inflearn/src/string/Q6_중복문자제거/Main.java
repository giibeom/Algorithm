package string.Q6_중복문자제거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public String solution(String input) {
        String answer = "";
        String[] inputs = input.split("");

        for (String s : inputs) {
            if (answer.indexOf(s) == -1) {
                answer += s;
            }
        }

        return answer;
    }

    public String solutionToLecture(String input) {
        String answer = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) {
                answer += input.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        System.out.println(main.solution(br.readLine()));
        System.out.println(main.solutionToLecture(br.readLine()));
    }
}
