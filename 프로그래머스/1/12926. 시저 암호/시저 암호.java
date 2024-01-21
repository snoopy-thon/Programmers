import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] strArr = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(strArr[i] == ' '){
                answer += String.valueOf(strArr[i]);
                continue;
            }
            int tmp2 = strArr[i]+n;
            if(tmp2 > 122 || (strArr[i]<=90 && tmp2>90))tmp2 -= 26;
            char tmp = (char)(tmp2);
            
            answer += String.valueOf(tmp);
        }
        return answer;
    }
}