import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int j=0;
        
        for(String str:strArr){
            if(j % 2 != 0)
                answer[j] = str.toUpperCase();
            else
                answer[j] = str.toLowerCase();
        
            j++;
        }
        
        return answer;
    }
}