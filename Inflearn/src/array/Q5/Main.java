package array.Q5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(int num) {
        int answer = 0;

        for (int i = 2; i <= num; i++) {
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    answer++;
                } else if (i % j == 0) {
                    break;
                }
            }
        }
        return answer;
    }

    public int solutionInLectureThroughtSieveOfEratosthenes(int num) {
        int answer = 0;

        int[] checkArr = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            if (checkArr[i] == 0) {
                answer++;

                for (int j = i; j <= num; j = j + i) { // i의 배수로 증가해야되니까 i씩 증가하면 된다
                    checkArr[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
//        System.out.println(main.solution(num));
        System.out.println(main.solutionInLectureThroughtSieveOfEratosthenes(num));
    }
}
