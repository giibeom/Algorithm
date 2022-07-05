package 반복문.Q8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Created by 명기범 on 2022-07-05
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
