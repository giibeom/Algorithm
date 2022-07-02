package array.Q12_멘토링;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int stuNum, int testCount, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= stuNum; i++) { // 학생 쭈욱 돌기
            int[] mentee = new int[stuNum + 1];

            for (int j = 0; j < testCount; j++) { // 테스트당 올체크
                for (int k = 0; k < stuNum; k++) { // 한줄씩 체크
                    if (arr[j][k] == i) { // 해당 test 줄에서 해당 학생 찾기
                        // 멘티가능 학생 집어넣기
                        for (int l = k + 1; l < stuNum; l++) {
                            if (mentee[arr[j][l]] == 0) {
                                mentee[arr[j][l]] = 1;
                            }
                        }
                        break;
                    } else {
                        // 멘티 실패 시 걸러내기
                        mentee[arr[j][k]] = -1;
                    }
                }
            }

            // i 학생의 찐멘티들 체크해서 answer 증가
            for (int m = 0; m < mentee.length; m++) {
                if (mentee[m] == 1) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public int solutionInLecture(int stuNum, int testCount, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= stuNum; i++) {
            for (int j = 1; j <= stuNum; j++) {
                int cnt = 0;
                for (int k = 0; k < testCount; k++) {
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < stuNum; s++) {
                        if (arr[k][s] == i) {
                            pi = s;
                        }
                        if (arr[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                    if (cnt == testCount) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int stuNum = Integer.parseInt(st.nextToken());
        int testCount = Integer.parseInt(st.nextToken());
        int [][] arr = new int[testCount][stuNum];

        for (int i = 0; i < testCount; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < stuNum; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(main.solution(stuNum, testCount, arr));
    }
}
