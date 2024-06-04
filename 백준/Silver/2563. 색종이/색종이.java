import java.io.*;
import java.util.*;

class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 색종이의 수 입력받기
        int num = Integer.parseInt(br.readLine());
        int[][] whiteArr = new int[100][100];
        int[][] arr = new int[num][2];
        int sum=0;

        for(int i=0; i<num; i++) {
            // 색종이를 붙인 위치 입력받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

            // 흰색 도화지에 색종이가 있는 곳을 1로 표기하고 더하기
            for(int m = arr[i][1]; m<arr[i][1]+10; m++) {
                for (int j = arr[i][0]; j < arr[i][0] + 10; j++) {
                    // 이전에 1로 표기한 곳은 중복표기하지 않기 
                    if (whiteArr[m][j] == 0) {
                        whiteArr[m][j] = 1;
                        sum += 1;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}




