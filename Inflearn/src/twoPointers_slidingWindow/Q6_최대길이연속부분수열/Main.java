package twoPointers_slidingWindow.Q6_최대길이연속부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public int solutionButTimeLimit(int length, int k, int[] arr) {
        int answer = 0;
        ArrayList<Integer> targetArr = new ArrayList<>();

        // 0인 index들 찾기
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                targetArr.add(i);
            }
        }

        for (int j = 0; j <= targetArr.size() - k; j++) {

            int [] tmp = arr.clone();

            for (int n = 0; n < k; n++) {
                tmp[targetArr.get(j + n)] = 1;
            }

            int consecutiveCnt = 0;
            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] == 1) {
                    consecutiveCnt++;
                } else {
                    answer = Math.max(answer, consecutiveCnt);
                    consecutiveCnt = 0;
                }
            }
        }

        return answer;
    }

    // 강의 풀이 전 내용 설명만 듣고 풀기
    public int solutionThroughtConceptExplain(int length, int k, int[] arr) {
        int answer = 0;
        int lt = 0;
        int rt = 0;
        int changeCount = 0;

        for (int i = 0; i < length; i++) {
            if (arr[rt] == 0) {
                changeCount++;
            }
            while (changeCount > k) {
                if (arr[lt] == 0) {
                    changeCount--;
                }
                lt++;
            }

            answer = Math.max(answer, (rt - lt + 1));
            rt++;
        }

        return answer;
    }

    // solutionThroughtConceptExplain 와 로직 동일
    public int solutionInLecture(int length, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for (int rt = 0; rt < length; rt++) {
            if (arr[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, (rt - lt + 1));
        }


        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solutionThroughtConceptExplain(length, k, arr));
    }
}
