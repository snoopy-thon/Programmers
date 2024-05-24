import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int count = 0;

        while(count < 100){
            String s = br.readLine();
            if ("".equals(s) || s==null){
                str = str.trim();
                break;
            }
            str += s;
            str += "\n";
            s.trim();
            count++;
        }

        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken("\n"));
        }
    }
}






