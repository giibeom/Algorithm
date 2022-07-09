package 반복문.Q2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            StringBuilder result = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                result.append("*");
            }
            System.out.printf("%" + num + "s\n", result.toString());
        }
    }
}
