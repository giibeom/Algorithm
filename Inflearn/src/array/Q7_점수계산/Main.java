package array.Q7_점수계산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(int count, String grading) {
        int answer = 0;

        String[] grades = grading.split(" ");

        int preNumChk = 0;
        for (String grade : grades) {
            if (grade.equals("1")) {
                answer += (1 + preNumChk);
                preNumChk++;
            } else {
                preNumChk = 0;
            }
        }

        return answer;
    }

    public int solutionInLecture(int count, String grading) {
        int answer = 0;
        int preNumChk = 0;
        String[] grades = grading.split(" ");

        for (int i = 0; i < count; i++) {
            if (grades[i].equals("1")) {
                preNumChk++;
                answer += preNumChk;
            } else {
                preNumChk = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String grading = br.readLine();

        System.out.println(main.solutionInLecture(count, grading));
    }
}
