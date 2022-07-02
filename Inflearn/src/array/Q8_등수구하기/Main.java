package array.Q8_등수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public String solution(int count, String scores) {
        StringBuilder answer = new StringBuilder();
        StringTokenizer st = new StringTokenizer(scores);
        ArrayList<Integer> scoreList = new ArrayList<>();

        while (st.hasMoreTokens()) {
            scoreList.add(Integer.parseInt(st.nextToken()));
        }

        // TODO 1. 등수대로 배열 정렬
        LinkedList<Integer> rankList = createRankSort(scoreList);

        // TODO 2. 들어온 값 인덱스를 answer에 세팅
        for (int i = 0; i < scoreList.size(); i++) {
            // TODO 3. 동점일때 처리??
            for (int j = 0; j < rankList.size(); j++) {
                if (scoreList.get(i) == rankList.get(j)) {
                    answer.append(j + 1).append(" ");
                    break;
                }
            }
        }

        return answer.toString();
    }

    private LinkedList<Integer> createRankSort(ArrayList<Integer> scoreList) {
        LinkedList<Integer> rank = new LinkedList<>();

        for (int score : scoreList) {
            if (rank.size() > 0) {
                for (int i = 0; i < rank.size(); i++) {

                    if (rank.get(i) > score) {
                        if (i == rank.size() - 1) {
                            rank.add(score);
                            break;
                        }
                    } else if (rank.get(i) <= score) {
                        rank.add(i, score);
                        break;
                    } else {
                        rank.add(score);
                    }
                }
            } else {
                rank.add(score);
            }
        }
        return rank;
    }

    public int[] solutionInLecture(int count, String scores) {
        int[] answer = new int[count];
        int[] arr = new int[count];

        StringTokenizer st = new StringTokenizer(scores);
        int idx = 0;
        while (st.hasMoreTokens()) {
            arr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }

        /*
            완전탐색 알고리즘은 이중for문 돌면서 하나하나씩 체크하면 됨
            이중for문을 돌면서 자기보다 클때마다 1로 초기화되어있는 rank를 1 증가하면 자동으로 동점 핸들링도 가능
        * */
        for (int i = 0; i < count; i++) {
            int rank = 1;
            for (int j = 0; j < count; j++) {
                if (arr[j] > arr[i]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String scores = br.readLine();

//        System.out.print(main.solution(count, scores));

        for (int rank : main.solutionInLecture(count, scores)) {
            System.out.print(rank + " ");
        }
    }
}
