import java.util.*;

class Solution {
    public String solution(String s) {
        // 1. 공백을 만나면 인덱스를 0으로 초기화, 공백 추가
        // 2. 인덱스가 0이고 a~z일 경우, 대문자로 변환하고 대체한다.
        // 3. 인덱스가 0이 아닌 나머지 경우, 소문자로 변환하고 대체한다.
       
        String answer = "";
        int index = 1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                index = 0;
            }
            if(index == 1){
                if(s.charAt(i) >= 'a' && s.charAt(i) <='z'){
                    answer += (char)(s.charAt(i) - 32);
                }else{
                    answer += s.charAt(i);
                }
            }else {
                if(s.charAt(i) >= 'A' && s.charAt(i) <='Z'){
                    answer += (char)(s.charAt(i) + 32);
                }else{
                    answer += s.charAt(i);
                }
            }
            index++;
        }

        return answer;
        }
    }
