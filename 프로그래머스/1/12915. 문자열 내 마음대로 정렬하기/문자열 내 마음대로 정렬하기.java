import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // substring을 이용하자 !
        String[] answer = new String[strings.length];
        for(int i=0; i<strings.length; i++){
            answer[i] = strings[i].substring(n,n+1) + strings[i];
        }
        Arrays.sort(answer);
        for(int j=0; j<answer.length; j++){
            answer[j] = answer[j].substring(1);
        }
        return answer;
    }
}