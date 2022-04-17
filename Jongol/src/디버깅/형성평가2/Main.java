package 디버깅.형성평가2;

import java.util.Scanner;

/**
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        int sum = ((int)a + (int)b + (int)c);
        double avg = (a + b + c)/3;

        System.out.println("sum " + sum);
        System.out.println("avg " + (int) avg);

        scanner.close();
    }
}
