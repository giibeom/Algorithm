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

    /*

    * */
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String numLine = br.readLine();

        System.out.println(main.solution(count, numLine));
    }
}
