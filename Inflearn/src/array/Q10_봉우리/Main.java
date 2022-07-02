package array.Q10_봉우리;

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


    /*
    - 미리 체크할 인덱스를 배열로 만들어놓자
        - 배열로 만드는 이유는 만약 상하좌우 뿐만 아니라 대각선까지 봤을경우 그 외적인 추가작업일 경우 일일히 조건문을 추가하기보다는 배열 하나 선언하고 3중 for문 돌리면 됨
        - int[] dx = {-1, 0, 1, 0};
        - int[] dy = {0, 1, 0, -1};
    */
    public int solutionInLecture(int length, int[][] arr) {
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= length; j++) {
                boolean flag = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < length && ny >= 0 && ny < length && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
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
