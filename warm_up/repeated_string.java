// Copyright (c) 2019 Abhineet Dubey. All rights reserved.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long a_count = 0;
        long total_a_count = 0;
        long modulo_s = 0;

        if(n>s.length()){
          for (int i=0; i<s.length(); i++)
            if(s.charAt(i)=='a') a_count++;

          total_a_count = a_count*(n/s.length());
          modulo_s = n%s.length();

          for (int i=0; i<modulo_s; i++)
            if(s.charAt(i)=='a') total_a_count++;

          return total_a_count;
        }

        else {
          for (int i=0; i<n; i++)
            if(s.charAt(i)=='a') a_count++;
          return a_count;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
