import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Stack<Integer> stack = new Stack<>();
        int[] workDays = new int[progresses.length];
        ArrayList<Integer> tmp = new ArrayList<>();
        
        // 남은 작업일수 구하기
        for(int k=0; k<progresses.length; k++) {
            if((100-progresses[k])%speeds[k] == 0 ) {
                workDays[k] = (100 - progresses[k]) / speeds[k];
            }else{
                workDays[k] = (100 - progresses[k]) / speeds[k] + 1;
            }
        }
        
        // stack을 이용하여, 한 번 배포할 때의 기능 개수 구하기
        int i=0;
        while(i<workDays.length){
            stack.push(workDays[0]);
            for(int j=i+1; j<workDays.length; j++){
                if(workDays[i] >= workDays[j]){
                    stack.push(workDays[j]);
                }else{
                    break;
                }
            }
            tmp.add(stack.size());
            i += stack.size();
            stack.clear();
        }
        
        // ArrayList를 배열로 바꿔주기
        int[] answer = new int[tmp.size()];
        for(int l=0; l<answer.length; l++){
            answer[l] = tmp.get(l);
        }
        
        return answer;
    }
}