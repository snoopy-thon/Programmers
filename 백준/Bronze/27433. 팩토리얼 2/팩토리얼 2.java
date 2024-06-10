import java.io.*;
import java.net.SocketTimeoutException;
import java.util.*;

class Main {
    static long recursion(int n){
        if(n==0){
            return 1;
        }
        return n * recursion(n-1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = recursion(n);
        System.out.println(result);

    }
}




