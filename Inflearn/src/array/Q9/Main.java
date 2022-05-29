package array.Q9;

import java.io.IOException;
import java.util.Scanner;


/*
- 각 행과 열은 한 for문에서 구하기 가능
   - 행 : arr[i][j]
   - 열 : arr[j][i]
- 양 대각선은 특징을 이용하여 한 for문에서 구하기 가능
   - 왼쪽 대각선 : arr[i][i]
   - 오른쪽 대각선 : arr[i][length-1-i]
- Math.max를 이용하여 최대값 구하기
* */
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


    public int solutionInLecture(int length, int[][] inputArr) {
        int answer = Integer.MIN_VALUE;
        int rowSum = 0;
        int columnSum = 0;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < inputArr.length; i++) {
            rowSum = 0;
            columnSum = 0;
            for (int j = 0; j < inputArr[i].length; j++) {
                rowSum += inputArr[i][j];
                columnSum += inputArr[j][i];
            }
            answer = Math.max(answer, rowSum);
            answer = Math.max(answer, columnSum);
        }

        for (int i = 0; i < length; i++) {
            leftDiagonalSum += inputArr[i][i];
            rightDiagonalSum += inputArr[i][length - 1 - i];
        }
        answer = Math.max(answer, leftDiagonalSum);
        answer = Math.max(answer, rightDiagonalSum);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
        System.out.println(main.solution(arr, rowMax));*/


        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());

        int[][] inputArr = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                inputArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solutionInLecture(length, inputArr));
    }
}
