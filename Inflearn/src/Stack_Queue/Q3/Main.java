package Stack_Queue.Q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Stack<Integer>> stackList = new ArrayList<Stack<Integer>>();
        Stack<Integer> basket = new Stack<>();

        for (int i = 0; i < board.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = board[i].length - 1; j >= 0; j--) {
                if (board[j][i] != 0) {
                    stack.push(board[j][i]);
                }
            }
            stackList.add(stack);
        }

        for (int move : moves) {

            if (stackList.get(move - 1).isEmpty()) {
                continue;
            }

            Integer target = stackList.get(move - 1).pop();

            if (basket.isEmpty()) {
                basket.push(target);
            } else {
                if (basket.lastElement() == target) {
                    basket.pop();
                    answer += 2;
                } else {
                    basket.push(target);
                }
            }
        }

        return answer;
    }

    public int solutionInLecture(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int target = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    if (!stack.isEmpty() && target == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(target);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int boardLength = Integer.parseInt(br.readLine());
        int[][] board = new int[boardLength][boardLength];

        for (int i = 0; i < boardLength; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < boardLength; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int moveCount = Integer.parseInt(br.readLine());
        int[] moves = new int[moveCount];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < moveCount; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }


//        System.out.println(main.solution(board, moves));
        System.out.println(main.solutionInLecture(board, moves));
    }
}
