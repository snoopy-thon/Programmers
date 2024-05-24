import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] dial = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int time = 0;

        for(int i=0; i<s.length(); i++){
            for(int j=2; j<=9; j++){
                String tmp = Character.toString(s.charAt(i));
                if(dial[j].contains(tmp)){
                    time += j+1;
                }
            }
        }
        System.out.println(time);

    }
}






