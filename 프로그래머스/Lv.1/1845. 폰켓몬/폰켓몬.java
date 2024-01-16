import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // nums.length / 2 만큼 뽑을 수 있음
        // nums에서 중복 제거하기
        // 만약 중복제거한 배열의 크기 >= nums.length / 2 라면
        //  answer = nums.length / 2
        // 만약 중복제거한 배열의 크기 < nums.length / 2 라면
        //  answer = 중복제거한 배열의 크기
        
        int[] arr = Arrays.stream(nums).distinct().toArray();
        if(arr.length >= nums.length / 2){
            answer = nums.length / 2;
        }else{
            answer = arr.length;
        }
        return answer;
    }
}