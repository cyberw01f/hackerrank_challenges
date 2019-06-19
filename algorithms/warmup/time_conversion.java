import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     HH:MM:SSPM
     */
    static String timeConversion(String s) {
        char[] timeSeperated = s.toCharArray();
      if(timeSeperated[8]=='P'){ // add 12 PM exception
        if(timeSeperated[0]=='1' && timeSeperated[1]=='2'){
          char[] changedTimeString = Arrays.copyOf(timeSeperated, 8);
          String returnString = new String(changedTimeString);
          return returnString;
        }
        else {
          String HH = timeSeperated[0]+""+timeSeperated[1];
          int changedHours = 12 + Integer.parseInt(HH);
          HH = String.valueOf(changedHours);
          char[] changedHourString = HH.toCharArray();
          timeSeperated[0] = changedHourString[0];
          timeSeperated[1] = changedHourString[1];
          char[] changedTimeString = Arrays.copyOf(timeSeperated, 8);
          String returnString = new String(changedTimeString);
          return returnString;
        }
      }
      else{
        if(timeSeperated[0]=='1' && timeSeperated[1]=='2'){ // midnight 12 AM exception, 12:00:00AM
          timeSeperated[0]='0';
          timeSeperated[1]='0';
          char[] changedTimeString = Arrays.copyOf(timeSeperated, 8);
          String returnString = new String(changedTimeString);
          return returnString;
          }
        else{
          char[] timeSeperatedChanged = Arrays.copyOf(timeSeperated, 8);
          String returnString = new String(timeSeperatedChanged);
          return returnString;
        }
      }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
