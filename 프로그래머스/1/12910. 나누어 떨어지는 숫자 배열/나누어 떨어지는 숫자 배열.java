import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count=0;
        Arrays.sort(arr);

        for(int num:arr){
            if(num % divisor == 0){
                count++;
            }
        }
        
        if(count==0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[count];
        
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[j] = arr[i];
                j++;
            }
        }
        
        return answer;
    }
}