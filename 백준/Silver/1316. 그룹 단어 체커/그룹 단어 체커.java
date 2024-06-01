import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        for(int k = 0; k < n; k++) {
            String word = br.readLine();
            int firstIndex = 0;
            int lastIndex = 0;
            boolean flag = false;

            for (int i = 0; i < word.length(); i++) {
                firstIndex = word.indexOf(word.charAt(i));
                lastIndex = word.lastIndexOf(word.charAt(i));
                if (firstIndex == lastIndex) {
                    flag = true;
                } else {
                    int tmp = 0;
                    for (int j = firstIndex; j <= lastIndex; j++) {
                        if (word.charAt(firstIndex) != word.charAt(j)) {
                            flag = false;
                            break;
                        } else {
                            tmp++;
                        }
                    }
                    if(tmp == lastIndex - firstIndex + 1){
                        flag = true;
                    }
                }
                if(flag == false){
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}




