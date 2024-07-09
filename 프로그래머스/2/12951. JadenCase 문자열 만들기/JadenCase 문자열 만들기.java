import java.util.*;

class Solution {
    public String solution(String s) {
        // 1. 공백을 만나면 인덱스를 0으로 초기화
        // 2. 인덱스가 1이고 소문자인 경우, 대문자로 변환한다.
        // 3. 인덱스가 1이 아니고 대문자인 경우, 소문자로 변환한다.
       
        StringBuilder answer = new StringBuilder();
        int index = 1;
        
        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            
            if(currentChar == ' '){
                index = 1;
                answer.append(currentChar);
                continue;
            }
            
            if(index == 1){
                answer.append(Character.toUpperCase(currentChar));
            }else {
                answer.append(Character.toLowerCase(currentChar));
            }
            index++;
        }
        return answer.toString();
    }
    
   
}
