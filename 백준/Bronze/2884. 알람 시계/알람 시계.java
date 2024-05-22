import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (H == 0 && M < 45){
            H = 24;
        }
        if(M < 45){
            H = H - 1;
             M = 60 - (45 - M);
        }else{
            M -= 45;
        }





        sb.append(H).append(" ");
        sb.append(M).append(" ");


        System.out.println(sb);

    }
}