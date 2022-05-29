package array.Q10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int length, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (isPeaks(arr, i, j)) {
                    answer++;
                }
            }
        }

        return answer;
    }

    private boolean isPeaks(int[][] arr, int i, int j) {
        return arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1];
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[][] arr = new int[length + 2][length + 2];

        for (int i = 1; i <= length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = 1;
            while (st.hasMoreTokens()) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }

        System.out.println(main.solution(length, arr));
    }
}
