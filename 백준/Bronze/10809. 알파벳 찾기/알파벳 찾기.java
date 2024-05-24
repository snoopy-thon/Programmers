import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<26; j++){
                if(s.charAt(i) == ('a'+j) && arr[j] == -1){
                    arr[j] = i;
                }
            }
        }
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }

    }
}






