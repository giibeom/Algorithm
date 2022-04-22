package 배열2.형성평가6;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        int[][] numArr = new int[5][5];

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                if (i == 0) {
                    if (j % 2 == 0) {
                        numArr[i][j] = 1;
                    } else {
                        numArr[i][j] = 0;
                    }
                 } else {
                    if (j == 0) {
                        numArr[i][j] = numArr[i - 1][j + 1];
                    } else if (j == numArr[i].length - 1) {
                        numArr[i][j] = numArr[i - 1][j - 1];
                    } else {
                        numArr[i][j] = numArr[i - 1][j - 1] + numArr[i - 1][j + 1];
                    }
                }
            }
        }

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
