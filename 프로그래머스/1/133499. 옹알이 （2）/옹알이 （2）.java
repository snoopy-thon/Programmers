class Solution {
    public int solution(String[] babbling) {
        // babbling 배열을 for문으로 하나씩 검토한다.
        // 만약 단어에 ayaaya, yeye, woowoo, mama 가 포함되어 있다면 "1"로 대체한다.
        // aya, ye, woo, ma가 있는 지 확인하고, 있다면 ""으로 바꾼다.
        // 단어가 ""면 숫자를 센다. answer++;
        int answer = 0;
        String[] canSay = {"aya", "ye", "woo", "ma"};
        String[] cannotSay = {"ayaaya", "yeye", "woowoo", "mama"};
        for(String word:babbling){
            for(int i=0; i<cannotSay.length; i++){
                if(word.contains(cannotSay[i])){
                    word = word.replace(cannotSay[i],"1");
                }
            }
            for(int j=0; j<canSay.length; j++){
                if(word.contains(canSay[j])){
                    word = word.replace(canSay[j], "0");
                }
            }
            word = word.replaceAll("0","");
            if(word.equals("")){
                answer++;
            }
        }
        return answer;
    }
}