package array.Q3_가위바위보;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public void solution(int count, String a, String b) {

        ArrayList<String> aList = new ArrayList<>();
        ArrayList<String> bList = new ArrayList<>();

        setAListAndBList(a, b, aList, bList);

        for (int i = 0; i < count; i++) {
            String aNum = aList.get(i);
            String bNum = bList.get(i);

            if (aNum.equals(bNum)) {
                System.out.println("D");
                continue;
            }

            switch (aNum) {
                case "1" :
                    if ("2".equals(bNum)) {
                        System.out.println("B");
                    } else if ("3".equals(bNum)) {
                        System.out.println("A");
                    }
                    break;
                case "2":
                    if ("1".equals(bNum)) {
                        System.out.println("A");
                    } else if ("3".equals(bNum)) {
                        System.out.println("B");
                    }
                    break;
                case "3":
                    if ("1".equals(bNum)) {
                        System.out.println("B");
                    } else if ("2".equals(bNum)) {
                        System.out.println("A");
                    }
                    break;
            }
        }
    }


    public void solutionInLecture(int count, String a, String b) {
        ArrayList<String> aList = new ArrayList<>();
        ArrayList<String> bList = new ArrayList<>();

        setAListAndBList(a, b, aList, bList);

        for (int i = 0; i < count; i++) {
            String aNum = aList.get(i);
            String bNum = bList.get(i);

            if (aNum.equals(bNum)) {
                System.out.println("D");
            } else if (aNum.equals("1") && bNum.equals("3")) {
                System.out.println("A");
            } else if (aNum.equals("2") && bNum.equals("1")) {
                System.out.println("A");
            } else if (aNum.equals("3") && bNum.equals("2")) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String b = br.readLine();

        main.solution(count, a, b);
    }

    private void setAListAndBList(String a, String b, ArrayList<String> aList, ArrayList<String> bList) {
        StringTokenizer stA = new StringTokenizer(a);
        StringTokenizer stB = new StringTokenizer(b);

        while (stA.hasMoreTokens()) {
            aList.add(stA.nextToken());
        }
        while (stB.hasMoreTokens()) {
            bList.add(stB.nextToken());
        }
    }
}
