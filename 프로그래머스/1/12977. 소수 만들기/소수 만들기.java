class Solution {
    public int solution(int[] nums) {
        // nums에서 숫자 세개를 뽑는다.
        // 숫자 세개를 더했을 때 소수이면 count++ 한다.
        int answer = 0;
        int sum = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                   sum = nums[i] + nums[j] + nums[k];
                   if(isSosu(sum)){
                       answer++;
                   }
                }
            }
        }
        return answer;
    }
     boolean isSosu(int sum){
            for(int i=2; i<=Math.sqrt(sum); i++){
                if(sum % i == 0){
                    return false;
                }
            }
            return true;
        }
}