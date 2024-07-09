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
                index = 0;
                answer.append(currentChar);
                index++;
                continue;
            }
            
            if(index == 1){
                answer.append(changeToUpper(currentChar));
            }else {
                answer.append(changeToLower(currentChar));
            }
            index++;
        }
        return answer.toString();
    }
    
    // 대문자 변환 함수
    public char changeToUpper(char c){
        if(c >= 'a' && c <='z'){
            return (char)(c - 32);
        }
        return c;
    }
    
    // 소문자 변환 함수
    public char changeToLower(char c){
        if(c >= 'A' && c <='Z'){
            return (char)(c + 32);
        }
        return c;
    }
}
