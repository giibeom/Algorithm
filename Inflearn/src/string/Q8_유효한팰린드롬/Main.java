package string.Q8_유효한팰린드롬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public boolean solution(String str) {

        StringBuilder changeStr = new StringBuilder();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (Character.isLetter(c)) {
                changeStr.append(c);
            }
        }

        String result = changeStr.toString();

        String left = "";
        String right = "";
        if (result.length() % 2 == 0) {
            left = result.substring(0, result.length() / 2);
            right = result.substring(result.length() / 2);
        } else {
            left = result.substring(0, result.length() / 2);
            right = result.substring(result.length() / 2 + 1);
        }

        return left.equalsIgnoreCase(new StringBuilder(right).reverse().toString());
    }

    public boolean solutionInLectureThroughReplaceAll(String str) {

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        return str.equals(tmp);
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        if (main.solutionInLectureThroughReplaceAll(br.readLine())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
