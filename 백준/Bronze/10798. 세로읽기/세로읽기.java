import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] wordArr = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                wordArr[i][j] = input.charAt(j);
            }
        }


        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                // 값이 null일 때, 출력하지 않음
                // char 형에서 null 값인지 확인하려면 (비교하고싶은값 == 0) 하면 됨
                if (wordArr[j][i] == 0) {
                    continue;
                }
                System.out.print(wordArr[j][i]);

            }
        }
    }
}

