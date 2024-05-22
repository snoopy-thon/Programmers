import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= (n / 4); i++){
            sb.append("long").append(" ");
        }
        sb.append("int");

        System.out.println(sb);
    }
}