package 입력.형성평가2;

/**
 * 실수형 변수를 2개 선언한 후 각각에 80.5 22.34를 대입한 후 두 수의 합을 구하여
 * 각각의 숫자를 10칸씩 오른쪽에 맞추어 소수 둘째자리까지 출력하는 프로그램을 작성하시오.
 *
 *      80.50     22.34    102.84
 */
public class Main {
    public static void main(String[] args) {
        double a = 80.5;
        double b = 22.34;

        System.out.printf("%10.2f", a);
        System.out.printf("%10.2f", b);
        System.out.printf("%10.2f", (a+b));
    }
}
