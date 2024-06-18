import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // 1번째 요소부터 score 배열의 길이-1까지 현재 인덱스값과 링크드리스트안의 요소를 비교한다.
        // 비교 후 크기에 맞는 자리에 값을 추가한다.
        // 사이즈가 k가 넘으면 가장 작은 값(링크드리스트의 첫번째 요소)을 삭제한다.
        // 추가, 삭제 후 최종적인 링크드리스트의 첫번째 요소를 result 배열에 추가한다.
       
       LinkedList<Integer> rank = new LinkedList();
        int[] result = new int[score.length];
        // rank에 아무값도 없는 경우, 0번째 값을 넣어준다. 
        rank.add(score[0]);
        // 0번째 값 반환하는 것 잊지 않기 !
        result[0] = rank.get(0);

        for (int j = 1; j < score.length; j++) {
            for (int i = 1; i <= rank.size(); i++) {
                if (score[j] >= rank.get(rank.size() - i)) {
                    // 에러 메시지 : java.lang.IndexOutOfBoundsException: Index: 100, Size: 1
                    // 계속 범위 오류라고 틀렸던 이유 
                    // -> 연결리스트 add 메서드 매개변수인 인덱스와 값을 반대로 넣음.
                    // -> rank.add(인덱스, 값)
                    rank.add(rank.size() - i + 1, score[j]);
                    break;
                }// else문은 사용하면 안됨. 사용할경우 값이 반복문 돌때마다 계속 추가됨


            }
            // score[j]가 가장 작은 값일 경우(= rank에 있는 요소 중 score[j]보다 작은 값이 없는 경우)
            if (score[j] < rank.get(0)) {
                rank.addFirst(score[j]);
            }
            // rank의 사이즈가 k를 넘는 경우, rank의 가장 작은 값을 제거한다.
            if (rank.size() > k) {
                rank.removeFirst();
            }
            // rank의 가장 작은 값을 반환한다.
            result[j] = rank.get(0);
        }
       return result;
    }
}
