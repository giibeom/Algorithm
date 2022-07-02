package Stack_Queue.Q2_괄호문자제거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    continue;
                }
                stack.pop();
            } else {
                if (stack.isEmpty()) {
                    answer.append(c);
                }
            }
        }

        return answer.toString();
    }

    public String solutionInLecture(String str) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') {}
            } else {
                stack.push(x);
            }
        }

        for (Character character : stack) {
            answer.append(character);
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

//        System.out.println(main.solution(str));
        System.out.println(main.solutionInLecture(str));
    }
}
