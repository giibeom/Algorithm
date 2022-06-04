package twoPointers_slidingWindow.Q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public ArrayList<Integer> solutionButTimeLimit(int aCount, int bCount, int[] aArr, int[] bArr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int a : aArr) {
            if (Arrays.stream(bArr).anyMatch(b -> b == a)) {
                answer.add(a);
            }
        }

        answer.sort(Comparator.naturalOrder());

        return answer;
    }

    // 내 풀이와 강의 내 풀이 코드가 완전 동일
    public ArrayList<Integer> solution(int aCount, int bCount, int[] aArr, int[] bArr) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(aArr);
        Arrays.sort(bArr);
        int p1 = 0;
        int p2 = 0;

        while (p1 < aCount && p2 < bCount) {
            if (aArr[p1] == bArr[p2]) {
                answer.add(aArr[p1]);
                p1++;
                p2++;
            } else if (aArr[p1] < bArr[p2]) {
                p1++;
            } else if (aArr[p1] > bArr[p2]) {
                p2++;
            }
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int aCount = Integer.parseInt(br.readLine());
        int[] aArr = new int[aCount];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aCount; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
        }

        int bCount = Integer.parseInt(br.readLine());
        int[] bArr = new int[bCount];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bCount; i++) {
            bArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int result : main.solution(aCount, bCount, aArr, bArr)) {
            System.out.print(result + " ");
        }
    }
}
