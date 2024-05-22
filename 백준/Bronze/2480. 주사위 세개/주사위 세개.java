import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        int price = 0;

        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean IsFirstSecondSame = arr[0] == arr[1] && arr[1] != arr[2];
        boolean IsSecondThirdSame = arr[0] != arr[1] && arr[1] == arr[2];
        boolean IsFirstThirdSame = arr[0] == arr[2] && arr[1] != arr[2];
        boolean IsAllSame = arr[0] == arr[1] && arr[1] == arr[2];

        if(IsAllSame){
            price = 10000 + arr[0] * 1000;
        }else if(IsFirstSecondSame || IsFirstThirdSame){
            price = 1000 + arr[0] * 100;
        }
        else if(IsSecondThirdSame){
            price = 1000 + arr[1] * 100;
        }
        else {
            Arrays.sort(arr);
            price = arr[arr.length-1] * 100;
        }

        sb.append(price);
        System.out.println(sb);
    }
}