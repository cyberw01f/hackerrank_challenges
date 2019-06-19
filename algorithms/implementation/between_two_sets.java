import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcm = calculateLCM(a);
        int gcf = calculateGCF(b);
        int totalInteger = 0;
        for(int i = lcm, j =2; i<=gcf; i=lcm*j,j++){
            if(gcf%i==0){ totalInteger++;}
          }
        return totalInteger;
    }


    static int calculateLCM(List<Integer> arr){
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            result = calculateLCM(result, arr.get(i));
        }

        return result;
    }

    static int calculateLCM(int a,int b){
       int min,max,lcm=1,x;
        if(a>b){
           max =  a;
           min =  b;
       }else{
           max =  b;
           min =  a;
        }

        for(int i=1;i<max;i++){
            x = max*i;
            if(x%min==0){
                lcm = x;
                break;
            }
        }

      return lcm;
    }

    static int calculateGCF(List<Integer> arr){
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            result = calculateGCF(result, arr.get(i));
        }
        return result;
    }

    static int calculateGCF(int a,int b) {
        List<Integer> numberList = new ArrayList<Integer>();
        numberList.add(a);
        numberList.add(b);
        Integer maxNumber = Collections.max(numberList);
        int gcf = 1;
        for (int i = maxNumber; i > 1; i--) {
            boolean check = false;
            for (int j = 0; j < numberList.size(); j++) {
                if (numberList.get(j) % i == 0) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) {
                for (int j = 0; j < numberList.size(); j++) {
                    numberList.set(j, numberList.get(j) / i);
                }
                gcf *= i;
                maxNumber = Collections.max(numberList);
            }
        }

        return gcf;
      }



}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
