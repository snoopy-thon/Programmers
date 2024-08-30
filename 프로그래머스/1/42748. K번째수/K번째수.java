import java.util.*; 

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // array를 i부터 j까지 잘라서 다른 배열에 옮긴다.
        // 새로운 array를 정렬한다.
        // k번째 인덱스에 해당하는 새로운 array값을 answer배열에 넣는다.
        int[] answer = new int[commands.length];
        int j=0;
        for(int[] command : commands){
            int length = command[1] - command[0] + 1;
            int[] newArray = new int[length];
            for(int i=0; i<length; i++){
                newArray[i] = array[command[0]-1+i];
            }
            Arrays.sort(newArray);
            answer[j] = newArray[command[2]-1];
            j++;
        }
        
        return answer;
    }
}