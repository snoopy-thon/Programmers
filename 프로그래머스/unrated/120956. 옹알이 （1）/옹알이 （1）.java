class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babyWord = {"aya", "ye", "woo", "ma"};
        for(String word : babbling){
            for(int j=0; j<4; j++){
                for(String bw : babyWord){
                    if(word.startsWith(bw)){
                        word = word.replace(bw,"");
                    }
                }
            }
            if(word == ""){
                answer++;
            }
        }
        return answer;
    }
}