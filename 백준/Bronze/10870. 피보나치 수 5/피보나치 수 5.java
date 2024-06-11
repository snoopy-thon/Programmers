import java.io.*;

class Main {

    static long fibo(int n) {
        int[] numbers = new int[n + 1];
        numbers[0] = 0;
        if (n == 0) {
            return numbers[0];
        }
        numbers[1] = 1;
        if (n == 1) {
            return numbers[1];
        }
        if (n >= 2) {
            for (int i = 0; i < n - 1; i++) {
                numbers[i + 2] = numbers[i] + numbers[i + 1];
            }
        }

        return numbers[n];

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibo(n));

    }
}




