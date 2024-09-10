class Solution {
    public int solution(String s) {
        // 만약 a와 같지 않다면 notSame++;
        // a와 같다면 same++;
        // 만약 notSame == same 인 경우, 분해하기
        int answer = 0;
        int same = 1;
        int notSame = 0;
        int i=0;
        int j=1;
        while(true){
            if(j >= s.length()-1){
                answer++;
                break;
            }
            if(s.charAt(i) == s.charAt(j)){
                same++;
            }else{
                notSame++;
            }
            
            if(same == notSame){
                answer++;
                i = 0;
                s = s.substring(j+1);
                j = 1;
                same = 1;
                notSame = 0;
                continue;
            }
            j++;
            
        }
        return answer;
    }
}