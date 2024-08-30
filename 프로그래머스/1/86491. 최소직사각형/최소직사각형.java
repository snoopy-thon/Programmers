class Solution {
    public int solution(int[][] sizes) {
        // 최소 직사각형
        // 가로와 세로 둘중 더 긴 길이를 가로에 넣는다.
        // 가로 중 가장 긴 길이 * 세로 중 가장 긴 길이
        int answer = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        int maxW = sizes[0][0];
        int maxH = sizes[0][1];
        for(int j=0; j<sizes.length; j++){
            if(sizes[j][0] > maxW){
                maxW = sizes[j][0];
            }
            if(sizes[j][1] > maxH){
                maxH = sizes[j][1];
            }
        }
        answer = maxW * maxH;
        return answer;
    }
}