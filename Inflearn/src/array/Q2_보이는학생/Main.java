package array.Q2_보이는학생;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public int solution(String str) {
        int answer = 0;

        ArrayList<Integer> heightList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            heightList.add(Integer.parseInt(st.nextToken()));
        }

        int maxHeight = 0;
        for (int height : heightList) {
            if (maxHeight < height) {
                answer++;
                maxHeight = height;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String str = br.readLine();

        System.out.println(main.solution(str));
    }
}
