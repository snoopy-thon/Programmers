class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=s.length()-1; i>=0; i--){
            int count = 0;
            for(int j=i-1; j>=0; j--){
                count++;
                if(s.charAt(i) == s.charAt(j)){
                    answer[i] = count;
                    break;
                }
            }
            if(answer[i] == 0){
                answer[i] = -1;
            }
        }
        return answer;
    }
}