package 반복제어문1.형성평가1;

import java.util.Scanner;

/**
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();

        for (int i = 0; i < index; i++) {
            System.out.print((i+1) + " ");
        }
    }
}
