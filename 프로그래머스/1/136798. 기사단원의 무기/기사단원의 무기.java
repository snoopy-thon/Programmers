class Solution {
    public int solution(int number, int limit, int power) {
        // 약수 구할 때 제곱근 이용해서 구해야 시간초과 안남 !
        // 1~number까지 숫자들의 약수 개수를 각각 구하여 배열에 넣는다.
        // 배열안의 숫자중 limit보다 큰 숫자는 power로 대체한다.
        // 배열의 모든 원소의 총합을 구한다.
        int answer = 0;
        int[] yaksuArr = new int[number];
        for(int i=0; i<yaksuArr.length; i++){
            if(countYaksu(i+1) <= limit)
                yaksuArr[i] = countYaksu(i+1);
            else
                yaksuArr[i] = power;
            answer += yaksuArr[i];
        }
        return answer;
    }
    
    int countYaksu(int num){
        int count = 0;
        for(int i=1; i<=Math.sqrt(num); i++){
            if(num % i == 0) {
                count++;
                if(i != (num / i)){
                    count++;
                }
            }
        }
        return count;
    }
}