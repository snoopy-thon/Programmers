class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(char str:control.toCharArray()){
            if(str == 'w') n += 1;
            else if(str == 's') n -= 1;
            else if(str == 'd') n += 10;
            else if(str == 'a') n -= 10;
            
        }
        return n;
    }
}