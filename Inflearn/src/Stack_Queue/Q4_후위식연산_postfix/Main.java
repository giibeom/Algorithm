package Stack_Queue.Q4_후위식연산_postfix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    private int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                Integer rightNumber = stack.pop();
                Integer leftNumber = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(leftNumber + rightNumber);
                        break;
                    case '-':
                        stack.push(leftNumber - rightNumber);
                        break;
                    case '*':
                        stack.push(leftNumber * rightNumber);
                        break;
                    case '/':
                        stack.push(leftNumber / rightNumber);
                        break;
                }
            }
        }

        return stack.firstElement();
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(main.solution(str));
    }
}
