package HashMap_TreeSet.Q4_모든아나그램찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
4. 모든 아나그램 찾기
- 내 풀이 전략과 강의 풀이 전략 동일
- mapA.equals(mapB) : map끼리의 객체 비교

- My solution
   - Sliding Window + two pointers 알고리즘
   - map끼리 일일히 for문 돌려서 key와 value값을 확인함

- Lecture solution
   - Sliding Window + two pointers 알고리즘
   - windowMap.equals(targetMap)으로 한방에 비교
*/
public class Main {

    public int solution(String[] strArr, int targetLength, HashMap<String, Integer> targetMap) {
        int answer = 0;

        HashMap<String, Integer> windowMap = new HashMap<>();

        for (int i = 0; i < targetLength; i++) {
            windowMap.put(strArr[i], windowMap.getOrDefault(strArr[i], 0) + 1);
        }

        if (targetMap.size() == windowMap.size()) {
            boolean isAnagram = true;
            for (String key : targetMap.keySet()) {
                if (!(windowMap.containsKey(key) && windowMap.get(key).equals(targetMap.get(key)))) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram) {
                answer++;
            }
        }


        int lt = 0;
        for (int rt = targetLength; rt < strArr.length; rt++) {
            windowMap.put(strArr[rt], windowMap.getOrDefault(strArr[rt], 0) + 1);
            windowMap.put(strArr[lt], windowMap.get(strArr[lt]) - 1);
            if (windowMap.get(strArr[lt]) == 0) {
                windowMap.remove(strArr[lt]);
            }
            lt++;

            if (targetMap.size() == windowMap.size()) {
                boolean isAnagram = true;
                for (String key : targetMap.keySet()) {
                    if (!(windowMap.containsKey(key) && windowMap.get(key).equals(targetMap.get(key)))) {
                        isAnagram = false;
                        break;
                    }
                }
                if (isAnagram) {
                    answer++;
                }
            }

        }

        return answer;
    }

    public int solutionTest(String[] strArr, int targetLength, HashMap<String, Integer> targetMap) {
        int answer = 0;

        HashMap<String, Integer> windowMap = new HashMap<>();

        for (int i = 0; i < targetLength; i++) {
            windowMap.put(strArr[i], windowMap.getOrDefault(strArr[i], 0) + 1);
        }

        if (windowMap.equals(targetMap)) {
            answer++;
        }

        int lt = 0;
        for (int rt = targetLength; rt < strArr.length; rt++) {
            windowMap.put(strArr[rt], windowMap.getOrDefault(strArr[rt], 0) + 1);
            windowMap.put(strArr[lt], windowMap.get(strArr[lt]) - 1);
            if (windowMap.get(strArr[lt]) == 0) {
                windowMap.remove(strArr[lt]);
            }
            lt++;

            if (windowMap.equals(targetMap)) {
                answer++;
            }

        }

        return answer;
    }

    public int solutionInLecture(String[] strArr, int targetLength, HashMap<String, Integer> targetMap) {
        int answer = 0;
        HashMap<String, Integer> windowMap = new HashMap<>();

        for (int i = 0; i < targetLength - 1; i++) {
            windowMap.put(strArr[i], windowMap.getOrDefault(strArr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = targetLength - 1; rt < strArr.length; rt++) {
            windowMap.put(strArr[rt], windowMap.getOrDefault(strArr[rt], 0) + 1);

            if (windowMap.equals(targetMap)) {
                answer++;
            }

            windowMap.put(strArr[lt], windowMap.get(strArr[lt]) - 1);
            if (windowMap.get(strArr[lt]) == 0) {
                windowMap.remove(strArr[lt]);
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] strArr = br.readLine().split("");
        String[] targetArr = br.readLine().split("");

        HashMap<String, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < targetArr.length; i++) {
            targetMap.put(targetArr[i], targetMap.getOrDefault(targetArr[i], 0) + 1);
        }

        System.out.println(main.solutionInLecture(strArr, targetArr.length, targetMap));
    }

}
