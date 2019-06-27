import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static int pageCount(int n, int p) {
        int pageCounterStart = 0;
        int pageCounterEnd = 0;
        pageCounterStart = (p/2);
        if(n%2==1)
            pageCounterEnd = (n-p)/2;
        else
            pageCounterEnd = (int) Math.ceil((n-p)/2.0);

        return Math.min(pageCounterStart,pageCounterEnd);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
