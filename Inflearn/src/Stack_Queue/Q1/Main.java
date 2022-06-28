package Stack_Queue.Q1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public String solution(String[] strArr) {
        String answer = "NO";

        int leftCount = 0;
        int rightCount = 0;

        if (strArr[0].equals(")") || strArr[strArr.length - 1].equals("(")) {
            return "NO";
        }

        for (String str : strArr) {
            if (str.equals("(")) {
                leftCount++;
            } else {
                rightCount++;
            }
        }

        if (leftCount == rightCount) {
            answer = "YES";
        }

        return answer;
    }

    public String solutionInLectureThroughtStack(String[] strArr) {
        String answer = "YES";

        Stack<String> stack = new Stack<>();

        for (String str : strArr) {
            if (str.equals("(")) {
                stack.push(str);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split("");
//        System.out.println(main.solution(strArr));
        System.out.println(main.solutionInLectureThroughtStack(strArr));
    }
}
