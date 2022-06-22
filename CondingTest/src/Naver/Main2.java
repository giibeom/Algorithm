package Naver;

public class Main2 {

    public static void main(String[] args) {
        String [] str = "Naver Webtoon Limited.".split(" ");
        String [] removeTarget = "aeiou".split("");

        System.out.println(removeTarget);

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < removeTarget.length; j++) {
                str[i] = str[i].replaceAll(removeTarget[j], "");
            }
        }


        String input = "Naver Webtoon Limited.";

        input = input.replaceAll("aeiou", "");

        for (int i = 0; i < removeTarget.length; i++) {
            input = input.replaceAll(removeTarget[i], "");
        }


        System.out.println(input);


/*        for (String result : str) {
            System.out.print(result + " ");
        }*/



    }
}
