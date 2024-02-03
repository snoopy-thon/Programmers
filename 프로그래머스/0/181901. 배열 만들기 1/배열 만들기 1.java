import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int i = 1;
        arrList.add(k);
        while(true){
            if(n < arrList.get(i-1)+k) break;
            arrList.add(k * (i+1));
            i++;
        }
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}