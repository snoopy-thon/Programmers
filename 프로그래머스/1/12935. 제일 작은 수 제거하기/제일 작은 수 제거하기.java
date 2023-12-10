import java.util.*;

class Solution {
    public static int[] removeElement(int[] arr, int item){
        return Arrays.stream(arr)
                .filter(i->i != item)
                .toArray();
    }
    
    public int[] solution(int[] arr) {
        // arr에서 최소값 찾기
        // Stream을 사용하여 arr의 최소값 제거
        // 만약 arr의 길이가 1이면 -1을 반환 
        
        int[] copyArr = arr.clone();
        Arrays.sort(copyArr);
        
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        };
        
        arr = removeElement(arr, copyArr[0]);
        
       
        return arr;
    }
}