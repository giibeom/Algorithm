package 입력.형성평가3;

/**
 * 정수형 변수 한 개를 선언하여 50을 대입하고 실수형 변수 한 개를 선언하여 100.12를 대입한 후 다음과 같이 출력되는 프로그램을 작성하시오.
 * (결과값은 소수점 이하에서 반올림)
 *
 * 100.12 * 50 = 5006
 */
public class Main {
    public static void main(String[] args) {
        int a = 50;
        double b = 100.12;

        System.out.printf("%.2f * %d = %d", b, a, Math.round((b*a)));
    }
}
