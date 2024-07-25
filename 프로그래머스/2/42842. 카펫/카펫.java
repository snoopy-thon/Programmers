class Solution {
    public int[] solution(int brown, int yellow) {
        // 카펫의 전체 넓이brown과 yellow를 더한다.
        // 카펫의 가로 w, 세로 h
        // h >= 3
        
        int w;
        int h = 3;
        int area = brown + yellow;
        
        while(true){
            if(area % h != 0){
                h++;
                continue;
            }
            
            w = area / h;
            if((w-2)*(h-2) == yellow){
                return new int[] {w, h};
            }
            h++;
        }

        
        
       
    }
}