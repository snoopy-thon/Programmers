import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int k = 0; k < t; k++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String newStr = "";
            String s = st.nextToken();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < r; j++) {
                    newStr += Character.toString(s.charAt(i));
                }
            }
            System.out.println(newStr);
        }
    }
    }






