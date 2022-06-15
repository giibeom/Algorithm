package 조건문.Q2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private String solution(int hour, int minute, int time) {

        int minSum = minute + time;
        if (minSum > 59) {
            hour += (minSum / 60);
            minute = (minSum % 60);
        } else {
            minute += time;
        }

        if (hour > 23) {
            hour = hour % 24;
        }

        return hour + " " + minute;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        System.out.println(main.solution(hour, minute, time));
    }
}