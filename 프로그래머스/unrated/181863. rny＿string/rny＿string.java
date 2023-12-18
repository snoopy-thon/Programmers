class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(String str:rny_string.split("")){
            if(str.equals("m")){
                answer += "rn";
            }else{
                answer += str;
            }
        }
        
        
        return answer;
    }
}