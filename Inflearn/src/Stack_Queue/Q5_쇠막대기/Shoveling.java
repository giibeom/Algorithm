package Stack_Queue.Q5_쇠막대기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Shoveling {

    /*
        1. ')' 괄호일 때 레이저와 정상 파이프 구분 필요
        2. 괄호 안에 레이저 개수 + 1개가 절단된 파이프 개수
        3. 레이저 개수를 축적해놓고 닫힐때마다 레이저 카운트 + 1을 추가하면 되지않을까?
        
        쥐뿔 개뿔 안됨 -> (0 0) (0) : 0이 레이저라고 했을 때 해당 경우의 수 대응 안됨
        
        1. 레이저 개수를 숫자로 반환해서 스택에다 변환하는 과정
        2. 레이저 개수를 숫자로 집어넣은 버전을 다시 for문 돌려 새로운 스택에 쌓기
        3. ')' 올때마다 해당 숫자 개수 + 1를 answer에 추가하면 되지 않을까?
        4. ')'로 지워졌는데 앞에 숫자가 있을 시 숫자 더해서 합치기
        
        이때부터 멘탈이 산으로 가기 시작 -> 강의를 듣자


    */
    private int solution(String str) {
        int result = 0;
        int laser = 0;
        boolean beforeLaser = false;
        Stack<Character> stack = new Stack();

        for (char c : str.toCharArray()) {

            if (stack.isEmpty()) {
                laser = 0;
            }

            if (c == ')' && stack.lastElement() == '(') {

                if (!beforeLaser) { // 전에 레이저가 아니였다면 이게 레이저
                    beforeLaser = true;
                    laser++;
                    stack.pop();
                    continue;
                } else { // 전에 레이저였다면 지금은 정상 파이프
                    result += (laser + 1);
                    stack.pop();
                }

            } else {
                stack.push(c);
            }

            beforeLaser = false;
        }

        return result;
    }

    private int solution2(String str) {
        int result = 0;

        Stack<Character> stack = createResultStack(str);
        Stack<Character> resultStack = new Stack<>();
        for (char c : stack) {

            if (c == ')') {
                Character laserCount = resultStack.pop();
                result += Character.getNumericValue(laserCount);
                resultStack.pop();

                if (Character.isDigit(resultStack.peek())) {
                    int sumBeforeAndAfterLagerCount = Character.getNumericValue(resultStack.pop()) + Character.getNumericValue(laserCount);
                    resultStack.push((char) (sumBeforeAndAfterLagerCount + '0'));
                } else {
                    resultStack.push(laserCount);
                }

            } else if (Character.isDigit(c)) {
                if (resultStack.isEmpty()) {
                    continue;
                } else if (Character.isDigit(resultStack.peek())) {
                    int sumBeforeAndAfterLagerCount = Character.getNumericValue(resultStack.pop()) + Character.getNumericValue(c);
                    resultStack.push((char) (sumBeforeAndAfterLagerCount + '0'));
                } else {
                    resultStack.push(c);
                }

            } else {
                resultStack.push(c);
            }
        }


        return result;
    }

    private Stack<Character> createResultStack(String str) {
        Stack<Character> stack = new Stack();
        boolean beforeLaser = false;

        for (char c : str.toCharArray()) {

            if (c == ')' && stack.lastElement() == '(') {

                if (!beforeLaser) { // 전에 레이저가 아니였다면 이게 레이저
                    beforeLaser = true;
                    stack.pop();
                    if (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                        int increaseLaser = Character.getNumericValue(stack.pop()) + 1;
                        stack.push((char) (increaseLaser + '0'));
                    } else {
                        stack.push('1');
                    }

                    continue;
                } else { // 전에 레이저였다면 지금은 정상 파이프
                    stack.push(c);
                }

            } else {
                stack.push(c);
            }

            beforeLaser = false;
        }
        return stack;
    }

    
    public static void main(String[] args) throws IOException {
        Shoveling main = new Shoveling();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(main.solution2(br.readLine()));
    }
}
