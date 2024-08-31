import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 오름차순으로 정렬한다.
        // for(int i=0; i<=score.length/m; i++)
        // score[score.length % m + m*i]
       
        int answer = 0;
        Arrays.sort(score);
        for(int i=0; i<score.length / m; i++){
            answer += score[score.length%m + m*i] * m;
        }
        return answer;
    }
}