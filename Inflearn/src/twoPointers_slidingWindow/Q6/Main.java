package twoPointers_slidingWindow.Q6;

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


    public int solutionInLecture(int length, int k, int[] arr) {
        int answer = 0;

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

        System.out.println(main.solutionInLecture(length, k, arr));
    }
}
