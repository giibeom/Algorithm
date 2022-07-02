package array.Q11_임시반장정하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public int solution(int stuNum, int[][] arr) {
        int answer = 1;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            ArrayList<Integer> stuList = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < stuNum; k++) {
                    if (i != k && arr[i][j] == arr[k][j]) {
                        if (stuList.indexOf(k) == -1) {
                            count++;
                            stuList.add(k);
                        }
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

    public int solutionInLectureThroughHorizontalSearch(int stuNum, int[][] arr) {
        int answer = 1;
        int maxCount = 0;

        for (int i = 0; i < stuNum; i++) {
            int count = 0;
            ArrayList<Integer> stuList = new ArrayList<>();
            for (int j = 0; j < stuNum; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i != k && arr[i][j] == arr[k][j]) {
                        if (stuList.indexOf(k) == -1) {
                            count++;
                            stuList.add(k);
                        }
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

        System.out.println(main.solutionInLectureThroughHorizontalSearch(stuNum, arr));
    }
}
