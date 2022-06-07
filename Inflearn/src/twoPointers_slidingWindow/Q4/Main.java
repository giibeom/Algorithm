package twoPointers_slidingWindow.Q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 실패... 강의설명좀 보고 다시 풀어보자
    public int solution(int length, int targetSum, int[] arr) {
        int answer = 0;
        int sum = 0;
        int p1 = 0;
        int p2 = 0;

        // 윈도우 만들기
        while (true) {
            sum += arr[p2];

            if (sum == targetSum) {
                answer++;
                p1++;
                p2++;
                break;
            }

            if (sum > targetSum) {
                break;
            }

            p2++;
        }

        while (p2 < length) {

            // sum이 크면 작아질때까지 줄여
            while (sum > targetSum) {
                sum -= arr[p1];

                if (sum == targetSum) {
                    answer++;
                    sum -= arr[++p1];
                    sum += arr[++p2];
                    break;
                } else {
                    p1++;
                }
            }

            // 오른쪽에 추가해
            while (sum < targetSum) {
                p2++;
                sum += arr[p2];

                if (sum == targetSum) {
                    answer++;
                    sum -= arr[++p1];
                    sum += arr[++p2];
                    break;
                }
            }
        }

        return answer;
    }

    public int solution2(int length, int targetSum, int[] arr) {
        int answer = 0;
        int lt = 0;
        int rt = 0;
        int sum = arr[rt];

        while (rt < length) {

            sum += arr[++rt];

            if (sum == targetSum) {
                answer++;
            }

            while (sum <= targetSum) {
                sum -= arr[--lt];
            }
        }

        return answer;
    }


    // 합이 작으면 sum += arr[++rt]
    // 비교
    // 합이 크거나 같으면 sum -= arr[--lt]
    public int solutionThroughtConceptExplain(int length, int targetSum, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int rt = 0;

        while (rt < length) {

            sum += arr[rt++];

            if (sum == targetSum) {
                answer++;
            }

            // sum이 작아질때까지
            while (sum > targetSum) {
                sum -= arr[lt++];

                if (sum == targetSum) {
                    answer++;
                }
            }
        }

        return answer;
    }


    // 더하고 rt증가하고 확인하고
    // 빼고나서 lt 증가하고 확인하고
    public int solutionInLecture(int length, int targetSum, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < length; rt++) {
            sum += arr[rt];
            if (sum == targetSum) {
                answer++;
            }
            while (sum >= targetSum) {
                sum -= arr[lt++];
                if (sum == targetSum) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int targetSum = Integer.parseInt(st.nextToken());

        int[] arr = new int[length];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(main.solutionThroughtConceptExplain(length, targetSum, arr));
    }
}
