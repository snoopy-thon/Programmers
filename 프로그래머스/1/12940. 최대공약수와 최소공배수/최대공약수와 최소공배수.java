import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        
        // 1. n과 m의 최대공약수를 찾는다.
        // 2. 최소 공배수 = (n * m) / 최대공약수
        
        int[] answer = new int[2];
        int gcd = 0;
        int lcm = 0;
        for(int i=1; i<=n && i<=m; i++){
            if(n % i == 0 && m % i == 0){gcd = i;}
        }
       
        lcm = (n * m) / gcd;
        answer[0] = gcd;
        answer[1] = lcm;
        
        return answer;
    }
}