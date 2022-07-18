package Stack_Queue.Q5_쇠막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    private int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        boolean beforeLaser = false;

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                beforeLaser = false;
            } else {
                if (!beforeLaser) { // 전에 레이저가 아니였다면 이게 레이저
                    beforeLaser = true;
                    stack.pop();
                    answer += stack.size();
                } else { // 전에 레이저였다면 파이프 끝자락
                    stack.pop();
                    answer += 1;
                }
            }
        }

        return answer;
    }

    private int solutionInLecture(String str) {
        int result = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();

                if (str.charAt(i - 1) == '(') {
                    result += stack.size();
                } else {
                    result += 1;
                }
            }
        }

        return result;
    }



    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        System.out.println(main.solution(br.readLine()));
        System.out.println(main.solutionInLecture(br.readLine()));
    }
}
