import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[9][9];
        int[] maxArr = new int[9];
        int max = 0;
        int resultMax = 0;
        int i_index = 0;
        int j_index = 0;


        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(arr[i][j] >= max){
                    max = arr[i][j];
                    i_index = i+1;
                    j_index = j+1;
                }
            }
        }

        sb.append(arr[i_index-1][j_index-1]).append("\n");
        sb.append(i_index).append(" ");
        sb.append(j_index);


        System.out.println(sb);
    }
}






