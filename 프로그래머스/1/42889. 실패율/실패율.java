class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int clearUsers = stages.length;
        double[] failureRate = new double[N];
        
        // 실패율 구하기
        for(int i=1; i<=N; i++){
            int notYetClearUsers = 0;
            for(int j=0; j<stages.length; j++){
                if(i == stages[j]) notYetClearUsers++;
            }
            failureRate[i-1] = (double)notYetClearUsers / clearUsers;
            clearUsers = clearUsers - notYetClearUsers;
            System.out.println(failureRate[i-1]);
            answer[i-1] = i;
        }
        
        // 정렬
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(failureRate[i] < failureRate[j]){
                    double valueTmp = failureRate[i];
                    failureRate[i] = failureRate[j];
                    failureRate[j] = valueTmp;
                    
                    int indexTmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = indexTmp;
                }else if(failureRate[i] == failureRate[j]){
                    if(answer[i]>answer[j]){
                        int equalTmp = answer[i];
                        answer[i] = answer[j];
                        answer[j] = equalTmp;
                    }
                }
            }
        }
        return answer;
    }
}