import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n*2][m];
        int[][] resultArr = new int[n][m];

        for(int i=0; i<n*2; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                resultArr[i][j] = arr[i][j] + arr[i+n][j];
                sb.append(resultArr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}






