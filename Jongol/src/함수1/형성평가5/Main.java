package 함수1.형성평가5;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] studentScore = new int[3][3];

        setStudentScore(scanner, studentScore);
        printScoreAndHorizentalSum(studentScore);
        printVerticalSumAndTotalSum(studentScore);
    }

    private static void printVerticalSumAndTotalSum(int[][] studentScore) {
        int totalSum = 0;
        for (int i = 0; i < studentScore.length; i++) {
            int sum = 0;
            for (int j = 0; j < studentScore[i].length; j++) {
                sum += studentScore[j][i];
                totalSum += studentScore[j][i];
            }
            System.out.print(sum + " ");
        }
        System.out.println(totalSum);
    }

    private static void printScoreAndHorizentalSum(int[][] studentScore) {
        for (int i = 0; i < studentScore.length; i++) {
            int sum = 0;
            for (int j = 0; j < studentScore[i].length; j++) {
                sum += studentScore[i][j];
                System.out.print(studentScore[i][j] + " ");
            }
            System.out.println(sum);
        }
    }

    private static void setStudentScore(Scanner scanner, int[][] studentScore) {
        for (int i = 0; i < studentScore.length; i++) {
            for (int j = 0; j < studentScore[i].length; j++) {
                studentScore[i][j] = scanner.nextInt();
            }
        }
    }
}
