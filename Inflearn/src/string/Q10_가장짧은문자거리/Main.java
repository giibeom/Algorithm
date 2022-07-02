package string.Q10_가장짧은문자거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public ArrayList<Integer> solution(String target, String c) {
        ArrayList<Integer> answer = new ArrayList<>();

        String[] split = target.split("");
        ArrayList<Integer> indexList = new ArrayList<>();

        int firstIndex = target.indexOf(c);
        if (firstIndex == -1) {
            return answer;
        } else {
            indexList.add(firstIndex);
        }

        int index = firstIndex;
        while (true) {
            int nextIndex = target.indexOf(c, index+ 1);

            if (nextIndex == -1) {
                break;
            } else {
                indexList.add(nextIndex);
                index = nextIndex;
            }
        }

        for (int i = 0; i < split.length; i++) {
            int min = 100;
            for (int idx : indexList) {
                int tmp = Math.abs(idx - i);
                if (min > tmp) {
                    min = tmp;
                }
            }
            answer.add(min);
        }

        return answer;
    }

    public int[] solutionInLecture(String target, char c) {
        int[] answer = new int[target.length()];

        int p = 1000;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for (int i = target.length() - 1; i >= 0; i--) {
            if (target.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                if (answer[i] > p) {
                    answer[i] = p;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String target = st.nextToken();
//        String c = st.nextToken();
//        for (int index : main.solution(target, c)) {
        char c  = st.nextToken().charAt(0);
        for (int index : main.solutionInLecture(target, c)) {
            System.out.print(index + " ");
        }
    }
}
