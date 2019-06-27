import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
      int[] birdCount = {0, 0, 0, 0, 0};
      int maxCount = -1;
      int winingBird = -1;
      for(int i=0; i<arr.size(); i++){ //1 4 4 4 5 3
        switch(arr.get(i)){
          case 1:
            birdCount[0]++; // 1
            break;
          case 2:
            birdCount[1]++; // 0
            break;
          case 3:
            birdCount[2]++; // 1
            break;
          case 4:
            birdCount[3]++; // 3
            break;
          case 5:
            birdCount[4]++; // 1
            break;
        }
      }
      int[] temp = birdCount.clone();
      Arrays.sort(temp);
      maxCount = temp[4];
      for(int i=0; i<5; i++){
        if(birdCount[i]==maxCount){
          winingBird = i+1;
          break;
        }
      }
      return winingBird;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
