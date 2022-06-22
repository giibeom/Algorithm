package NaverWebtoon;

/*
    Q) "Naver Webtoon Limited." 문자열에서 aeiou 문자를 제거하고 출력하세요

    - input : "Naver Webtoon Limited." , "aeiou"
    - output : Nvr Wbtn Lmtd.
*/
public class Test2 {

    public static void main(String[] args) {

        String input = "Naver Webtoon Limited.";
        String removeTarget = "aeiou";
        String answer = "";

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            // removeTarget에 존재하지 않을 경우 answer에 추가
            if (removeTarget.indexOf(charArray[i]) == -1) {
                answer += charArray[i];
            }
        }

        System.out.println(answer);

//        mySolution1();
//        mySolution2();
    }


    //    첫번째 시도에서는 2중 for문을 통해 replaceAll을 돌렸다
    private static void mySolution1() {
        String[] str = "Naver Webtoon Limited.".split(" ");
        String[] removeTarget = "aeiou".split("");

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < removeTarget.length; j++) {
                str[i] = str[i].replaceAll(removeTarget[j], "");
            }
        }

        for (String result : str) {
            System.out.print(result + " ");
        }
    }


    //    두번째 시도에서는 하나의 for문으로 각각의 removeTarget(a, e, i, o, u) 을 replaceAll로 지웠다
    private static void mySolution2() {
        String input = "Naver Webtoon Limited.";
        String[] removeTarget = "aeiou".split("");

        input = input.replaceAll("aeiou", "");

        for (int i = 0; i < removeTarget.length; i++) {
            input = input.replaceAll(removeTarget[i], "");
        }


        System.out.println(input);
    }
}
