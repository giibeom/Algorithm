package 문자열2.형성평가7;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String [] strArr1 = scanner.next().split("");
        String [] strArr2 = scanner.next().split("");

        String str1 = "";
        String str2 = "";

        for (String str : strArr1) {
            if (str.matches("[0-9]")) {
                str1 += str;
            } else {
                break;
            }
        }

        for (String str : strArr2) {
            if (str.matches("[0-9]")) {
                str2 += str;
            } else {
                break;
            }
        }

        System.out.println(Integer.parseInt(str1) * Integer.parseInt(str2));
    }
}
