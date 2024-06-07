import java.io.*;

class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // n 입력받기
        int n =Integer.parseInt(br.readLine());

        // n개의 수 입력받기
        int[] numbers = new int[n];
        for(int i=0; i<n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // max 값 찾기
        int max = 0;
        for(int i=0; i<numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }
        }
        int[] count = new int[max+1];

        // 해당하는 숫자를 count 하기
        for(int num:numbers){
            count[num]++;
        }

        // 누적합 구하기
        for(int i=1; i<count.length; i++) {
            count[i] += count[i-1];
        }

        // result 배열에 정렬
        int[] result = new int[numbers.length];

        for(int i=numbers.length-1; i>=0; i--) {
            result[count[numbers[i]]-1] = numbers[i];
            count[numbers[i]]--;
        }

        // 정렬한 결과 출력
        for(int i=0; i<result.length; i++) {
            bw.write(result[i]+"\n");
        }
        bw.close();
    }
}




