import java.io.*;
import java.util.*;

class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 5;
        int sum = 0;
        int[] numbers = new int[n];
        for(int i=0; i<n; i++){
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }
        int avg = sum / n;
        Arrays.sort(numbers);
        System.out.println(avg);
        System.out.println(numbers[2]);

    }
}




