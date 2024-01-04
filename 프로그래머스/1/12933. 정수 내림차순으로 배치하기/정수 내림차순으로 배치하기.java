import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        String newArr = "";
        Character[] arr = new Character[str.length()];
        
        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i);
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++){
            newArr += arr[i];
        }
        
        answer = Long.valueOf(newArr);
        
        return answer;
    }
}