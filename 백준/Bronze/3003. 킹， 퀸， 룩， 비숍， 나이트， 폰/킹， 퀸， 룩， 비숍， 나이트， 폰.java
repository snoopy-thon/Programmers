import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] chess = {1,1,2,2,2,8};
        int[] input = new int[6];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<input.length; i++){
                input[i] = Integer.parseInt(st.nextToken());
                System.out.printf(chess[i] - input[i]+" ");
        }
    }
}

