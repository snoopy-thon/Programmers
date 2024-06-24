import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s = br.readLine();
       Integer[] arr = new Integer[s.length()];
       int num = Integer.parseInt(s);
       for (int i = 0; i < arr.length; i++) {
           arr[i] = num % 10;
           num = num / 10;
       }
       Arrays.sort(arr, Collections.reverseOrder());
       for(int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]);
       }

    }
}



