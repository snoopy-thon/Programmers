import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String A = "";
        String B = "";

        for(int i=a.length()-1; i>=0; i--){
            A += Character.toString(a.charAt(i));
            B += Character.toString(b.charAt(i));
        }

        if(Integer.parseInt(A) > Integer.parseInt(B)){
            System.out.print(A);
        }else{
            System.out.print(B);
        }
    }
}






