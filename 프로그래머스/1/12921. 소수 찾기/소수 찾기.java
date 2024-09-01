class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            if(isSosu(i)){
                answer++;
            }
        }
        return answer;
    }
    
    boolean isSosu(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}