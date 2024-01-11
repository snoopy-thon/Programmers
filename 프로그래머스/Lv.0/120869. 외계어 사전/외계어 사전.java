class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String word : dic){
            int count = 0;
            for(int i=0; i<spell.length; i++){
                if(word.contains(spell[i])){
                    count++;
                }
            }
            if(count == spell.length){
                System.out.println(word);
                answer = 1;
                return answer;
            }
        }
        return answer;
    }
}