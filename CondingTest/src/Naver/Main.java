package Naver;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    /*
    * Q) input값이 큰 순서대로 랭킹을 산정해주세요. (단, 값이 같으면 동일 순위로 표기합니다.)
    ```
    - input : [98, 98, 50, 100, 30, 90]
    - output : [2, 2, 5, 1, 6, 4]

    * */


    public static void main(String[] args) {


        int [] input = {98, 98, 50, 100, 30, 90};

        // 1. input 정렬
        LinkedList<Integer> arr = new LinkedList<>();
        Arrays.sort(input);


        for (int i = 0; i < input.length; i++) {
        // 2. 해당 인덱스 LinkedList에 add (알아서 인덱스 밀려서 들어감)

            arr.add(i, input[i]);
        }

        // 3. 출력
        System.out.println(arr);
    }
}
