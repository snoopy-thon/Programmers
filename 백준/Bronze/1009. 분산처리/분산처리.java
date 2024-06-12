import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // a의 1의 자리 구하기
            int tmp = a;
            int first = 0;
            for (int j = 0; j < b; j++) {
                first = tmp % 10;
                tmp = first * a % 10;
            }
            if (first == 0) {
                first = 10;
            }
            System.out.println(first);
        }
    }
}



