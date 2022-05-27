package array.Q8;

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

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String scores = br.readLine();

        System.out.print(main.solution(count, scores));
    }
}
