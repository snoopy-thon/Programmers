class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // goal의 첫번째 단어가 cards1과 cards2의 첫번째단어와 같은지 확인
        // cards1과 cards2의 비교하는 단어의 인덱스는 각각 다르다.
        // 맞추면 인덱스가 올라간다.
        String answer = "Yes";
        int index1 = 0;
        int index2 = 0;
        for(String goalWord:goal){
            if((index1 < cards1.length) && goalWord.equals(cards1[index1])){
                index1++;
            }else if((index2 < cards2.length) && goalWord.equals(cards2[index2])){
                index2++;
            }else{
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}