package 조건문.Q1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringTokenizer strArr = new StringTokenizer(input);

        while (strArr.hasMoreTokens()) {
            int a = Integer.parseInt(strArr.nextToken());
            int b = Integer.parseInt(strArr.nextToken());

            if (a > b) {
                System.out.println(">");
            } else if (a < b) {
                System.out.println("<");
            } else {
                System.out.println("==");
            }
        }
    }
}
