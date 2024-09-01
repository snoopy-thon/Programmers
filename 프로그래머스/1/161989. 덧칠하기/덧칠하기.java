class Solution {
    public int solution(int n, int m, int[] section) {
        // s[0] + m - 1까지 커버가능한데
        // 이 값보다 작으면, 패스
        // 이 값보다 크면, 시작점을 다시 지정  
        int answer = 1;
        int start = section[0];
        for(int i=1; i<section.length; i++){
            if(section[i] > (start+m-1)){
                start = section[i];
                answer++;
            }
        }
        return answer;
    }
}