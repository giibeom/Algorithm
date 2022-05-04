package 입출력과사칙연산.Q1008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        int b = scanner.nextInt();

        if (b == 0) {
            System.out.println(a);
        } else {
            System.out.println((a / b));
        }
    }
}
