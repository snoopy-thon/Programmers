class Solution {
    public int solution(String t, String p) {
        // 1. p의 길이 p.length()
        // 2. t를 for문 돌림 t의 길이 - p의 길이+1
        // 3. 결과를 배열에 넣어놓고 p와 비교하기
        // 4. 작거나 같은 경우 answer++
        int answer = 0;
        String[] strArr = new String[t.length() - p.length() + 1];
        for(int i=0; i<strArr.length; i++){
            strArr[i] = t.substring(i,i+p.length());
            if(Long.parseLong(strArr[i]) <= Long.parseLong(p)){
                answer++;
            }
        }
       
        return answer;
    }
}