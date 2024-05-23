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
        int[] tmpArr = new int[n];
        
        for(int l=0; l<n; l++){
            arr[l] = l;
        }

        for(int k=0; k<m; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            for(int r=i; r<=j; r++){
                tmpArr[r] = arr[r];
            }
            for(int r=i; r<=j; r++){
                arr[j+i-r] = tmpArr[r];
            }

        }
        for(int t=0; t<arr.length; t++) {
            sb.append(arr[t] + 1).append(" ");
        }

        System.out.println(sb);
    }
}






