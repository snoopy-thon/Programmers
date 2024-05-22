import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int NUM = 10;
        int count = 1;
        int[] arr = new int[NUM];
        for (int i = 0; i < NUM; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num % 42;
        }

        Arrays.sort(arr);

        for (int j = 0; j < NUM-1; j++) {
            if(arr[j] != arr[j+1]){
                count++;
            }
        }

        sb.append(count);
        System.out.println(sb);
    }
}
