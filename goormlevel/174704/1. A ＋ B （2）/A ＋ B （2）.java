// 아래 두가지 import 필수
import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		// scanner 대신 bufferedReader 사용(시간 단축)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 한 줄에 입력받은 내용을 띄어쓰기 기준으로 구분하기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		
		double answer = a + b;
		
		// 소수점 6자리까지만 출력
		System.out.printf("%.6f",answer);
	}
}