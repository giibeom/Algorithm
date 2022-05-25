package array.Q6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public String solution(int count, String numLine) {
        StringBuilder answer = new StringBuilder();
        StringTokenizer st = new StringTokenizer(numLine);

        ArrayList<Integer> numList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            numList.add(Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()));
        }

        for (int num : numList) {

            if (num < 2) {
                continue;
            }

            boolean isPrimeNumber = true;
            int[] chkNum = new int[num + 1];

            for (int i = 2; i < chkNum.length; i++) {
                if (chkNum[i] == 0) {
                    if (num != i && num % i == 0) {
                        isPrimeNumber = false;
                        break;
                    }
                    for (int j = i; j <= num; j = j + i) {
                        chkNum[j] = 1;
                    }
                }
            }

            if (isPrimeNumber) {
                answer.append(num).append(" ");
            }
        }

        return answer.toString();
    }


    public ArrayList<Integer> solutionInLecture(int count, String numLine) {
        ArrayList<Integer> answer = new ArrayList<>();
        int [] arr = new int[count];

        StringTokenizer st = new StringTokenizer(numLine);
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        for (i = 0; i < count; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    private boolean isPrime(int res) {
        if (res == 1) {
            return false;
        }

        for (int i = 2; i < res; i++) {
            if (res % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String numLine = br.readLine();

        System.out.println(main.solution(count, numLine));
    }
}
