import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack();
        int right_count=0;
        int left_count=0;
        
        if(s.charAt(0) == ')'|| s.charAt(s.length()-1)=='('){
            answer = false;
            return answer;
        }else{
            for(int i=0; i<s.length(); i++ ){
                st.push(s.charAt(i));
            }
            while(!st.isEmpty()){
            if(st.peek()==')'){
                st.pop();
                right_count++;
            }else if(st.peek()=='('){
                st.pop();
                left_count++;
                if(left_count > right_count){
                    answer = false;
                    return answer;
                }
            }
        }
        }


        return answer;
    }
}