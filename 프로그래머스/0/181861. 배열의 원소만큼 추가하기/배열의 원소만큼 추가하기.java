import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>(); 
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                arrList.add(arr[i]);
            }
        }
         
   
        answer = arrList.stream().mapToInt(i->i).toArray();
          
        return answer;
    }
}