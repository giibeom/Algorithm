package array.Q11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int stuNum, int[][] arr) {
        int answer = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < 5; j++) {

                for (int k = 0; k < stuNum; k++) {
                    if (arr[i][j] == arr[k][j]) {
                        count++;
                    }
                }
            }
            if (count > maxCount) {
                maxCount = count;
                answer = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stuNum = Integer.parseInt(br.readLine());
        int[][] arr = new int[stuNum][5];

        for (int i = 0; i < stuNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(main.solution(stuNum, arr));
    }
}
