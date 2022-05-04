package 입출력과사칙연산.Q2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(scanner.readLine());
        int b = Integer.parseInt(scanner.readLine());

        scanner.close();

        String[] bArr = (b + "").split("");

        for (int i = bArr.length - 1; i >= 0; i--) {
            System.out.println(Integer.parseInt(bArr[i]) * a);
        }

        System.out.println(a * b);
    }
}
