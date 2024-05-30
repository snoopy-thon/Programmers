import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        word = word.toUpperCase();
        Arrays.sort(word.toCharArray());
        int[] count = new int[26];
        int max = 0;
        int max_index = 0;

        for(int i = 0; i < word.length(); i++) {
            count[word.charAt(i)-'A']++;
        }
        for(int i = 0; i < count.length; i++) {
            if(count[i] > max) {
                max = count[i];
                max_index = i;
            }else if(count[i] != 0 && count[i] == max) {
                max_index = -1;
            }
        }

        if(max_index == -1) {
            System.out.println("?");
        }else{
            System.out.println((char)(max_index + 'A'));
        }


    }

}


