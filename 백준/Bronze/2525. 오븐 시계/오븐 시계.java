import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        int total_min = a * 60 + b + c;
        int hour = total_min / 60;
        int min = total_min % 60;
        if (hour >= 24){hour = hour - 24;}
        
        sb.append(hour).append(" ");
        sb.append(min).append(" ");
        System.out.println(sb);
    }
}