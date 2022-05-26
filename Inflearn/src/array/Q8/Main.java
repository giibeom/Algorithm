package array.Q8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public LinkedList<Integer> solution(int count, String scores) {
        StringBuilder answer = new StringBuilder();
        StringTokenizer st = new StringTokenizer(scores);
        ArrayList<Integer> scoreList = new ArrayList<>();

        while (st.hasMoreTokens()) {
            scoreList.add(Integer.parseInt(st.nextToken()));
        }

        // TODO 1. 등수대로 배열 정렬
        LinkedList<Integer> rank = new LinkedList<>();

        for (int score : scoreList) {
            if (rank.size() > 0) {
                for (int i = 0; i < rank.size(); i++) {
                    if (rank.get(i) > score) {
                        continue;
                    } else if (rank.get(i) < score) {
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

        // TODO 2. 동점일때 처리??


        // TODO 3. 들어온 값 인덱스를 answer에 세팅


        return rank;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String scores = br.readLine();

        for (int result : main.solution(count, scores)) {
            System.out.print(result + " ");
        }

    }
}
