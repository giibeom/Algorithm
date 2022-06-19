package HashMap_TreeSet.Q2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    
    
    /*
        풀이 1. 두개를 모두 Map에 담고 다시 for문으로 비교
        for문 총 3개
    */
    public String solution(char[] arr1, char[] arr2) {
        String answer = "YES";

        HashMap<Character, Integer> firstStrMap = new HashMap<>();
        HashMap<Character, Integer> secondStrMap = new HashMap<>();

        for (char c : arr1) {
            firstStrMap.put(c, firstStrMap.getOrDefault(c, 0) + 1);
        }

        for (char c : arr2) {
            secondStrMap.put(c, secondStrMap.getOrDefault(c, 0) + 1);
        }

        for (char key : firstStrMap.keySet()) {
            if (firstStrMap.get(key) != secondStrMap.get(key)) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    /*
        풀이 2. 한개를 Map에 담고 두번째 for문에서 아나그램 여부 체크
        for문 총 2개
    */
    public String solution2(char[] arr1, char[] arr2) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : arr1) {
            map.put(c, map.getOrDefault(c, 0));
        }

        for (char c : arr2) {
            int count = map.getOrDefault(c, 0);

            if (count > 0) {
                map.put(c, count - 1);
            } else {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    /*
        풀이 2와 설계 동일

        강의 : 하나를 Map에 담고 for문을 돌면서 키가 없거나 해당 값이 0일 경우 바로 리턴
                위에 조건에서 안걸리면 해당 키의 밸류 1 감소
        for 문 2개
    */
    public String solutionInLecture(char[] arr1, char[] arr2) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : arr1) {
            map.put(c, map.getOrDefault(c, 0));
        }

        for (char c : arr2) {

            if (!map.containsKey(c) || map.get(c) == 0) {
                return "NO";
            }

            map.put(c, map.get(c) - 1);

        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();

        System.out.println(main.solution(arr1, arr2));
    }
}
