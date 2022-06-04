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

    public ArrayList<Integer> solutionThroughtTwoPointers(int aArrCount, int bArrCount, int[] aArr, int[] bArr) {

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < Math.max(aArrCount, bArrCount); i++) {

            if (p1 == aArrCount - 1) {
                for (int j = p2; j < bArrCount; j++) {
                    answer.add(bArr[j]);
                }
                break;
            } else if (p2 == bArrCount - 1) {
                for (int j = p1; j < aArrCount; j++) {
                    answer.add(aArr[j]);
                }
                break;
            } else {
                if (aArr[p1] < bArr[p2]) {
                    answer.add(aArr[p1]);
                    p1++;
                } else {
                    answer.add(bArr[p2]);
                    p2++;
                }
            }
        }

        return answer;
    }

    public ArrayList<Integer> solutionInLectureThroughtTwoPointers(int aArrCount, int bArrCount, int[] aArr, int[] bArr) {

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while (p1 < aArrCount && p2 < bArrCount) {
            if (aArr[p1] < bArr[p2]) {
                answer.add(aArr[p1++]);
            } else {
                answer.add(bArr[p2++]);
            }
        }

        while (p1 < aArrCount) {
            answer.add(aArr[p1++]);
        }

        while (p2 < bArrCount) {
            answer.add(bArr[p2++]);
        }

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

//        for (int result : main.solution(aArr, bArr)) {
//        for (int result : main.solutionThroughtTwoPointers(aArrCount, bArrCount, aArr, bArr)) {
        for (int result : main.solutionInLectureThroughtTwoPointers(aArrCount, bArrCount, aArr, bArr)) {
            System.out.print(result + " ");
        }

    }
}
