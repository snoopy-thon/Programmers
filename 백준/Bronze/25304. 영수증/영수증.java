import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];
        int realSum = 0;
        String result = " ";

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
            realSum += arr[i][0] * arr[i][1];
        }

        if (realSum == x){
            result = "Yes";
        }else{
            result = "No";
        }


        sb.append(result);
        System.out.println(sb);
    }
}