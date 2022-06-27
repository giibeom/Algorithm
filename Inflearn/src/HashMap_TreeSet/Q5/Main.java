package HashMap_TreeSet.Q5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public int solution(int[] card, int targetIndex) {
        int answer = 0;

        // 1. 3개씩 카드를 뽑고 합한 모든 값
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < card.length; i++) {
            for (int j = i + 1; j < card.length - 1; j++) {
                for (int k = j + 1; k < card.length; k++) {
                    int sum = card[i] + card[j] + card[k];
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        // 2. keySet을 sort하고 targetIndex번째 값 출력
        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort(Comparator.reverseOrder());

        // 3. targetIndex번째가 없으면 -1
        if (targetIndex > keyList.size()) {
            answer = -1;
        } else {
            answer = keyList.get(targetIndex);
        }

        return answer;
    }

    // Set : 중복제거를 하는 자료구조
    public int solutionInLectureThroughtTreeSet(int[] card, int targetIndex) {
        int answer = -1;

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < card.length; i++) {
            for (int j = i + 1; j < card.length - 1; j++) {
                for (int k = j + 1; k < card.length; k++) {
                    Tset.add(card[i] + card[j] + card[k])
                }
            }
        }

        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == targetIndex) {
                return x;
            }
        }

        return answer;
    }

   public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardLength = Integer.parseInt(st.nextToken());
        int targetIndex = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine());
        int[] card = new int[cardLength];

        for (int i = 0; i < cardLength; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

//        System.out.println(main.solution(card, targetIndex));
        System.out.println(main.solutionInLectureThroughtTreeSet(card, targetIndex));
    }
}
