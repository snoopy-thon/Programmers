import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
       
        int answer = 0;
        
        Arrays.sort(d);
        
       
        for(int i=0; i<d.length; i++){
            if(budget < d[i]){
                answer = i;
                break;
            }else if(budget == d[i] || d.length == 1){
                answer = i + 1;
                break;
            }
            budget -= d[i];
            answer = i+1;
            
        }
       
        
        return answer;
    }
}