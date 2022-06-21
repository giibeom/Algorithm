package HashMap_TreeSet.Q3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public String solution(int day, int continuity, int[] sales) {
        StringBuilder answer = new StringBuilder();

        HashMap<Integer, Integer> map = new HashMap<>();

        // 슬라이딩 윈도우 만들기
        for (int i = 0; i < continuity; i++) {
            map.put(sales[i], map.getOrDefault(sales[i], 0) + 1);
        }

        answer.append(map.keySet().size()).append(" ");

        for (int i = continuity; i < day; i++) {

            // 맨 오른쪽값 추가
            map.put(sales[i], map.getOrDefault(sales[i], 0) + 1);
            // 맨 왼쪽값 삭제
            map.put(sales[i - continuity], map.get(sales[i - continuity]) - 1);

            // value 0이면 키삭제
            if (map.get(sales[i - continuity]) == 0) {
                map.remove(sales[i - continuity]);
            }

            answer.append(map.keySet().size()).append(" ");
        }

        return answer.toString();
    }


    /*
        1. 윈도우 값을 내 풀이보다 하나를 덜 가져감
        2. rt값 추가
        3. 맵 size answer에 추가
        4. lt값 추가
        5. lt 값 0일시 key 삭제
    */
    public ArrayList<Integer> solutionInLecture(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int continuity = Integer.parseInt(st.nextToken());
        int[] sales = new int[day];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < day; i++) {
            sales[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solution(day, continuity, sales));
    }
}
