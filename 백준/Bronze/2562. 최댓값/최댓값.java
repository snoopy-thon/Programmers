import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int max_index = 0;

        int[] arr = new int[9];

        for(int i = 0; i < 9; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }
        int[] copyArr = arr.clone();
        Arrays.sort(arr);
        max = arr[arr.length - 1];
        for(int j=0; j<copyArr.length; j++){
            if(copyArr[j] == max) {
                max_index = j+1;
                break;
            }
        }
        sb.append(max).append("\n");
        sb.append(max_index);

        System.out.println(sb);
    }
}