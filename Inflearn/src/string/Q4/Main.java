package string.Q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public void solution(ArrayList<String> strList) {

        for (String str : strList) {
            String[] strArr = str.split("");
            for (int i = strArr.length - 1; i >= 0; i--) {
                System.out.print(strArr[i]);
            }
            System.out.println();
        }
    }

    public ArrayList<String> solutionToReverse(ArrayList<String> strList) {

        ArrayList<String> answer = new ArrayList<>();
        for (String str : strList) {
            String tmp = new StringBuilder(str).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public ArrayList<String> solutionToTmp(ArrayList<String> strList) {

        ArrayList<String> answer = new ArrayList<>();

        for (String str : strList) {
            char[] s = str.toCharArray();
            int lt = 0;
            int rt = str.length() - 1;

            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        ArrayList<String> strList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            strList.add(br.readLine());
        }

//        방법. 1
//        main.solution(strList);

        // 방법. 2
//        for (String x : main.solutionToReverse(strList)) {

        // 방법. 3
        for (String x : main.solutionToTmp(strList)) {
            System.out.println(x);
        }
    }

}
