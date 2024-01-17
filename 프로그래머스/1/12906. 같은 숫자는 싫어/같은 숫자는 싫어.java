import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
         int[] answer = {};

        Stack<Integer> stack = new Stack<>();

        for(int i : arr) {
            if(stack.isEmpty()) stack.push(i);
            else if(stack.peek() != i) stack.push(i);
        }
       
        answer = new int[stack.size()];

        for(int i=answer.length -1; i>=0; i--) {
            answer[i] = stack.pop();
        }
        
        
        
//         List<Integer> intList = new ArrayList<>();
//         for(int element : arr){
//             intList.add(element);
//         }
        
//         for(int i=0; i<intList.size()-1; i++){
//             if(intList.get(i) == intList.get(i+1)){
//                 intList.remove(i);
//                 i--;
//             }
//         }
        
//         for(Arraylist num:intList){
//             if(num == intList.get(i+1)){
//                 intList.remove(i);
//                 i--;
//             }
//         }
//         // int[] answer = intList.stream().mapToInt(i->i).toArray();
       
//         int[] answer = new int[intList.size()];
//         for (int i = 0 ; i < intList.size() ; i++ ) {
//             answer[i] = intList.get(i).intValue();
//         }

        return answer;
    }
}