import java.io.*;
import java.util.*;

class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n과 k 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        // n개의 수 입력받기
        st = new StringTokenizer(br.readLine());
        int[] numbers = new int[n];
        for(int i=0; i<n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);
        System.out.println(numbers[n-k]);

    }
}




