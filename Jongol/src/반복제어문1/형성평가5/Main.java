package 반복제어문1.형성평가5;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Base = ");
            double base = scanner.nextDouble();

            System.out.print("Height = ");
            double height = scanner.nextDouble();

            System.out.printf("Triangle width = %.1f\n", (base*height)/2);

            System.out.print("Continue? ");
            String isContinue = scanner.next();
            if (isContinue.equals("Y")) {
                continue;
            } else {
                break;
            }
        }
        scanner.close();
    }
}
