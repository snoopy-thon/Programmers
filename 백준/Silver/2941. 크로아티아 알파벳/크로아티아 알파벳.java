import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        // 만약 맨마지막 글자가 아니고 c라면 그 다음 값이 =이나 -인지 확인한다.
        // 만약 맨마지막 글자가 아니고 d라면 그 다음 값이 -인지 확인한다.
        // 만약 맨마지막에서 바로 앞글자가 아니고 d라면 그다음값이 z이고, 그다음값이 =인지 확인한다.
        // 만약 맨마지막 글자가 아니고 l이라면 그 다음 글자가 j인지 확인한다.
        // 만약 맨마지막 글자가 아니고 n이라면 그 다음 글자가 j인지 확인한다.
        // 만약 맨마지막 글자가 아니고 s이라면 그 다음 글자가 =인지 확인한다.
        // 만약 맨마지막 글자가 아니고 z이라면 그 다음 글자가 =인지 확인한다.

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (i < word.length() - 1) {
                if (word.charAt(i) == 'c') {
                    if (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-') {
                        count++;
                    }
                }
                if (word.charAt(i) == 'l') {
                    if (word.charAt(i + 1) == 'j') {
                        count++;
                    }
                }
                if (word.charAt(i) == 'n') {
                    if (word.charAt(i + 1) == 'j') {
                        count++;
                    }
                }
                if (word.charAt(i) == 's') {
                    if (word.charAt(i + 1) == '=') {
                        count++;
                    }
                }
                if (word.charAt(i) == 'd') {
                    if (word.charAt(i + 1) == '-') {
                        count++;
                    }
                }
                if (word.charAt(i) == 'z') {
                    if(i>0 && word.charAt(i-1) == 'd' && word.charAt(i+1) == '='){
                        count = count + 2;
                    }else if(i>0 && word.charAt(i-1) != 'd'&& word.charAt(i+1) == '='){
                        count++;
                    }else if(i==0 && word.charAt(i+1) == '='){
                        count++;
                    }
                }
            }

        }
        System.out.println(word.length() - count);
    }
}




