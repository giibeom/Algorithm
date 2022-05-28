package array.Q9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public int solution(int[][] arr, int rowMax) {
        int answer = 0;
        int columnMax = 0;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        int diagonalMax = 0;

        for (int i = 0; i < arr.length; i++) {
            int columnSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                columnSum += arr[j][i];

                if (i == j) {
                    leftDiagonalSum += arr[i][j];
                }

                if (j == (arr.length - 1 - i)) {
                    rightDiagonalSum += arr[i][j];
                }
            }
            if (columnSum > columnMax) {
                columnMax = columnSum;
            }
        }

        if (leftDiagonalSum >= rightDiagonalSum) {
            diagonalMax = leftDiagonalSum;
        } else {
            diagonalMax = rightDiagonalSum;
        }


        if (rowMax >= columnMax) {
            answer = rowMax;
        } else {
            answer = columnMax;
        }

        if (diagonalMax > answer) {
            answer = diagonalMax;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[][] arr = new int[length][length];
        int rowMax = 0;
        int columnMax = 0;

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int rowSum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                rowSum += arr[i][j];
            }

            if (rowSum > rowMax) {
                rowMax = rowSum;
            }

        }

        System.out.println(main.solution(arr, rowMax));
    }
}
