import java.io.*;
import java.net.SocketTimeoutException;
import java.util.*;

class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // n 입력받기
        int n =Integer.parseInt(br.readLine());

        // n개의 수 입력받기
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<n; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        // 오름차순 정렬하기
       Collections.sort(numbers);

        // 정렬한 결과 출력
        for(int i=0; i<n; i++) {
           bw.write(numbers.get(i)+"\n");
        }
        bw.close();
    }
}




