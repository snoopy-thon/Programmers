class Solution {
    public int[] solution(int N, int[] stages) {
        // i stage 와 같은 stages[i]의 개수 / 전체인원
        int[] answer = new int[N];
        int clearUsers = stages.length;
        double[] failRate = new double[N];
        
        for(int i=1; i<=N; i++){
            int notYetClearUsers = 0;
            for(int j=0; j<stages.length; j++){
                if(i == stages[j]) notYetClearUsers++;
            }
            failRate[i-1] = (double)notYetClearUsers / clearUsers;
            clearUsers = clearUsers - notYetClearUsers;
            System.out.println(failRate[i-1]);
            answer[i-1] = i;
        }
        
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(failRate[i] < failRate[j]){
                    double tmp = failRate[i];
                    failRate[i] = failRate[j];
                    failRate[j] = tmp;
                    
                    int indexTmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = indexTmp;
                }else if(failRate[i] == failRate[j]){
                    if(answer[i]>answer[j]){
                        int t = answer[i];
                        answer[i] = answer[j];
                        answer[j] = t;
                    }
                }
            }
        }
        return answer;
    }
}