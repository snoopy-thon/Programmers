import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            String input = br.readLine();
            System.out.print(input.charAt(0));
            System.out.println(input.charAt(input.length()-1));
        }
    }
}






