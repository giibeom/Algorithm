package Stack_Queue.Q6_공주구하기_QueueStart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private int solution(int n, int target) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {

            for (int i = 1; i <= target; i++) {
                Integer front = queue.poll();
                if (i != target) {
                    queue.offer(front);
                }
            }

        }

        return queue.peek();
    }

    private int solutionInLecture(int n, int target) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {

            for (int i = 1; i < target; i++) { // target - 1만큼 앞을 빼서 뒤로 붙이기
                queue.offer(queue.poll());
            }
            queue.poll();   // target번째 값은 삭제

            if (queue.size() == 1) { // queue 값이 1개 남았을 때 answer에 저장 후 종료
                answer = queue.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

//        System.out.println(main.solution(n, target));
        System.out.println(main.solutionInLecture(n, target));
    }
}
