package HashMap_TreeSet.Q1_학급회장_해쉬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

    private String solution(int stuNum, String[] voteArr) {
        String answer = "";
        int maxCount = 0;

        HashMap<String, Integer> resultArr = new HashMap<>();

        for (String vote : voteArr) {
            try {
                resultArr.put(vote, resultArr.get(vote) + 1);
            } catch (NullPointerException e) {
                resultArr.put(vote, 1);
            }
        }

        Iterator<String> iterator = resultArr.keySet().stream().iterator();
        while (iterator.hasNext()) {
            String candidate = iterator.next();
            if (maxCount < resultArr.get(candidate)) {
                maxCount = resultArr.get(candidate);
                answer = candidate;
            }
        }


        return answer;
    }

    /*
        HashMap <K, V> map
        V map.getOrDefault(key, 디폴트값) : key가 존재하면 해당 key의 value 리턴, key가 null 일 시 디폴트값 리턴
        Boolean map.containsKey('A') : map 안에 키들 중 'A'라는 키가 존재하는지 확인
        V map.remove('A') : A 키를 삭제하고 A의 Value 였던 값을 반환
        int map.size() : map의 사이즈를 반환
    */

    private char solutionInLecture(int stuNum, String voteStr) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char vote : voteStr.toCharArray()) {
            map.put(vote, map.getOrDefault(vote, 0) + 1);
        }

//        System.out.println(map.containsKey('F'));
//        System.out.println(map.remove('A'));
//        System.out.println(map.size());

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stuNum = Integer.parseInt(br.readLine());
//        String[] voteArr = br.readLine().split("");
//        System.out.println(main.solution(stuNum, voteArr));

        String vote = br.readLine();
        System.out.println(main.solutionInLecture(stuNum, vote));
    }
}
