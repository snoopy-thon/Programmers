class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // lottos를 오름차순 정렬 후, 0의 개수를 찾는다.
        // lottos와 win_nums를 비교하여 같은 숫자가 있으면 count++; 한다.
        // 최고순위는 count, 최고 순위는 count+numOfZero에 따라 순위가 정해진다.
        // answer[0] = 최저순위; answer[1] = 최고순위에 따른 순위;
        int[] answer = new int[2];
        int numOfZero = 0;
        int count = 0;
        int rank = 0;
        
        for(int lotto:lottos){
            if(lotto == 0){ numOfZero++; }
            for(int win_num:win_nums){
                if(lotto == win_num){
                    count++;
                }
            }
        }
        
        for(int i=answer.length-1; i>=0; i--){
            if(count == 6){
                rank = 1;
            }else if(count == 5){
                rank = 2;
            }else if(count == 4){
                rank = 3;
            }else if(count == 3){
                rank = 4;
            }else if(count == 2){
                rank = 5;
            }else {
                rank = 6;
            }
            answer[i] = rank;
            count += numOfZero;
        }
        
        return answer;
    }
}