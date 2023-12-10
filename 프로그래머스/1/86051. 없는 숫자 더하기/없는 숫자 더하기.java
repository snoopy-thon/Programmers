import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // 주어진 배열을 오름차순으로 정렬한다.
        // 길이가 10이 아니라면,
        // numbers[i]
        // 주어진 배열의 길이 ~ 9까지 더한다.
        int answer = 0;
        //0,4,5,6,7,8,9
        int[] originArray = {0,1,2,3,4,5,6,7,8,9};
        Arrays.sort(numbers);
        int i = 0, j = 0;
        while(i < numbers.length){
            if(numbers[i] != originArray[j]){
                answer += originArray[j];
            }else{
                i++;
            }
            j++;
        }
        if(numbers[numbers.length-1] != 9){
            for(int k=numbers[numbers.length-1]+1 ;k <= 9 ;k++){
                answer += k;
            }
        }
     
        return answer;
    }
}