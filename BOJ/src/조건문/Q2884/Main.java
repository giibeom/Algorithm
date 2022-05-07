package 조건문.Q2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(input);

        int hour = Integer.parseInt(stringTokenizer.nextToken());
        int minute = Integer.parseInt(stringTokenizer.nextToken());

        if ((minute - 45) < 0) {
            if ((hour - 1) < 0) {
                hour = 24 - 1;
            } else {
                hour = hour - 1;
            }
            minute = 60 - Math.abs(minute - 45);
        } else {
            minute = minute - 45;
        }
        System.out.println(hour + " " + minute);
    }
}
