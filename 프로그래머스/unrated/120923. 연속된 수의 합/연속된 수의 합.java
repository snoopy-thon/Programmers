class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        for(int j=total; j>=0; j--){
            int temp = 0;
            for(int i=0; i<num; i++){
                temp += (j-i);
            }
            if(temp == total){
                for(int k=0; k<num; k++){
                    answer[num-k-1] = j-k;
                }
            }
            
            if(total == 0){
                for(int i=0; i<num; i++){
                    answer[i] = i-num/2;
                }
            }
        }
        return answer;
    }
}