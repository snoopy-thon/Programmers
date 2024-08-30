import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // Arrays.copyOfRange() 사용한 풀이
        // array를 i부터 j까지 잘라서 다른 배열에 옮긴다.
        // 새로운 array를 정렬한다.
        // k번째 인덱스에 해당하는 새로운 array값을 answer배열에 넣는다.
        int[] answer = new int[commands.length];
        int index = 0;
        
        for(int[] command:commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] newArray = Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(newArray);
            answer[index] = newArray[k-1];
            index++;
        }
        
        return answer;
    }
}