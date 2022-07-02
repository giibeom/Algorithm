package twoPointers_slidingWindow.Q5_연속된자연수의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(int num) {
        int answer = 0;
        int sum = 0;
        int lt = 1;

        for (int i = 1; i < num; i++) {
            
            // i를 더하고 증가
            sum += i;

            if (sum == num) {
                answer++;
            }

            // sum이 num보다 크다면 작아질때까지 감소
            while (sum > num) {
                sum -= lt++;
                if (sum == num) {
                    answer++;
                }
            }

        }

        return answer;
    }


    // num / 2 + 1 까지만 돌면 됨
    public int solutionLecture(int num) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int m = num / 2 + 1;

        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int j = 0; j < m; j++) {
            sum += arr[j];
            if (sum == num) {
                answer++;
            }

            while (sum > num) {
                sum -= arr[lt++];
                if (sum == num) {
                    answer++;
                }
            }


        }
        

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println(main.solutionLecture(num));
    }
}
