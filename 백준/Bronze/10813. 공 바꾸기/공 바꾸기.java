import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int tmp = 0;
        for(int k=0; k<n; k++){
            arr[k] = k+1;
        }

        for(int l=0; l<m; l++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            tmp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = tmp;
        }

        for(int r=0; r<n; r++) {
            sb.append(arr[r]).append(" ");
        }
        System.out.println(sb);
    }
}