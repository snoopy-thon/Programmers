class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")){
            int count = 0;
            int zeroCount = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '1'){
                    count++;
                }else{
                    zeroCount++;
                }
            }
            answer[0]++;
            answer[1] += zeroCount;
            s = Integer.toBinaryString(count);
        }
   
        return answer;
    }
}