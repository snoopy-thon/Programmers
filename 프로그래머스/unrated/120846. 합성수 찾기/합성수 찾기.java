class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int k=1; k<=n; k++){
            int count = 0;
            for(int i=1; i<=k; i++){
                if(k % i == 0){
                    count++;
                }
                if(count >= 3){
                    answer++;
                    break;
                }
            }
            
        }
       
        return answer;
    }
}