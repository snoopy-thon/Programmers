import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> memories = new HashMap<>();
        for(int i=0; i<name.length; i++){
            memories.put(name[i], yearning[i]);
        }
        
        for(int j=0; j<photo.length; j++){
            for(int k=0; k<photo[j].length; k++){
                if(memories.get(photo[j][k]) != null){
                    answer[j] += memories.get(photo[j][k]);
                }
            }
        }
        return answer;
    }
}