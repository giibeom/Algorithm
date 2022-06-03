package twoPointers_slidingWindow.Q1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public ArrayList<Integer> solution(int[] aArr, int[] bArr) {

        ArrayList<Integer> answer = new ArrayList();

        for (int a : aArr) {
            answer.add(a);
        }

        for (int b : bArr) {
            answer.add(b);
        }

        answer.sort(Comparator.naturalOrder());

        return answer;
    }

    public ArrayList<Integer> solutionInLecture(int[] aArr, int[] bArr) {

        ArrayList<Integer> answer = new ArrayList<>();


        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int aArrCount = Integer.parseInt(br.readLine());
        int[] aArr = new int[aArrCount];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aArrCount; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
        }

        int bArrCount = Integer.parseInt(br.readLine());
        int[] bArr = new int[bArrCount];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bArrCount; i++) {
            bArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int result : main.solution(aArr, bArr)) {
            System.out.print(result + " ");
        }
    }
}
