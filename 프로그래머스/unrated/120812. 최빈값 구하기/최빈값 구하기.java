import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] countArr = new int[1000];
        
        if(array.length == 1) return array[0];
            
        for(int number : array){
            countArr[number]++;
        }
        
        int maxIndex = 0;
        for(int i=1; i<countArr.length; i++){
            if(countArr[i] > countArr[maxIndex]){
                maxIndex = i;
                answer = maxIndex;
            }else if (countArr[i] == countArr[maxIndex]){
                answer = -1;
            }
        }
        
        return answer;
    }
}