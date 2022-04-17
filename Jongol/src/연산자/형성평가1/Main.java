package 연산자.형성평가1;

import java.util.Scanner;

/**
 * 국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서
 * 총점과 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림 한다.)
 *
 * 70 95 63 100
 *
 * sum 328
 * avg 82
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kor = scanner.nextInt();
        int eng = scanner.nextInt();
        int math = scanner.nextInt();
        int computer = scanner.nextInt();
        int sum = kor + eng + math + computer;

        System.out.println("sum " + sum);
        System.out.println("avg " + (sum/4));
    }
}
