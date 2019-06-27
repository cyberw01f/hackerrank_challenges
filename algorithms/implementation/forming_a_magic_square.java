import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
      int[][] mSquare1 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
      int[][] mSquare2 = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
      int[][] mSquare3 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
      int[][] mSquare4 = {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
      int[][] mSquare5 = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
      int[][] mSquare6 = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
      int[][] mSquare7 = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
      int[][] mSquare8 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
      int[] sumAll = new int [8];
      int minCost = 0;
          for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
              sumAll[0] = sumAll[0] + Math.abs(s[i][j] - mSquare1[i][j]);
              sumAll[1] = sumAll[1] + Math.abs(s[i][j] - mSquare2[i][j]);
              sumAll[2] = sumAll[2] + Math.abs(s[i][j] - mSquare3[i][j]);
              sumAll[3] = sumAll[3] + Math.abs(s[i][j] - mSquare4[i][j]);
              sumAll[4] = sumAll[4] + Math.abs(s[i][j] - mSquare5[i][j]);
              sumAll[5] = sumAll[5] + Math.abs(s[i][j] - mSquare6[i][j]);
              sumAll[6] = sumAll[6] + Math.abs(s[i][j] - mSquare7[i][j]);
              sumAll[7] = sumAll[7] + Math.abs(s[i][j] - mSquare8[i][j]);
            }
          }
        minCost = sumAll[0];
          for(int i=0; i<8; i++){
            if(minCost>sumAll[i]) minCost=sumAll[i];
            }
            return minCost;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
