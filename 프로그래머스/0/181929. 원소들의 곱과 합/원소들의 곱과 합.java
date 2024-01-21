class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        for(int element:num_list){
            mul *= element;
            sum += element;
        }
        if(mul > sum*sum){
            answer = 0;
        }else answer = 1;
        return answer;
    }
}