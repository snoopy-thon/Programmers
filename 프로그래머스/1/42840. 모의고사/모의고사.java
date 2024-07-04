import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 1. 문제의 개수(answers.length)만큼 각각의 수포자가 찍은 답을 배열에 넣는다.
        // 2. 각 수포자의 답이 담겨있는 배열을 answers 와 비교한다.
        // 3. 가장 많이 일치하는 수포자의 번호를 return 한다.
        // (여러명일 경우 수포자의 번호를 오름차순하여 return 한다.)
        
        int[][] student = new int[3][answers.length];
        int[] answerCnt = new int[3];
        
        for(int i=0; i<answers.length; i++){
            student[0][i] = i % 5 + 1;
            if(i%2 == 0){
                student[1][i] = 2;
            }else{
                if(i%8 == 1){ student[1][i] = 1;}
                else if(i%8 == 3){ student[1][i] = 3;}
                else if(i%8 == 5){ student[1][i] = 4;}
                else if(i%8 == 7){ student[1][i] = 5;}       
            }
        }
        
        for(int j=0; j<answers.length; j++){
            if(j%10 == 0 || j%10 == 1){ student[2][j] = 3;}
            else if(j%10 == 2 || j%10 == 3){ student[2][j] = 1;}
            else if(j%10 == 4 || j%10 == 5){ student[2][j] = 2;}
            else if(j%10 == 6 || j%10 == 7){ student[2][j] = 4;}
            else if(j%10 == 8 || j%10 == 9){ student[2][j] = 5;}
        }
        
        for(int k=0; k<answers.length; k++){
            for(int l=0; l<student.length; l++){
                if(student[l][k] == answers[k]){ answerCnt[l]++;}
            }
        }
        
        int max = answerCnt[0];
        int maxIndex = 0;
        for(int i=0; i<answerCnt.length; i++){
            if(answerCnt[i] > max){
                max = answerCnt[i];
            }
        }
        List<Integer> tmp = new ArrayList<>();
        for(int i=0; i<answerCnt.length; i++){
            if(answerCnt[i] == max){
                tmp.add(i+1);
            }
        }
        
        int[] answer = tmp.stream()
                      .mapToInt(i->i)
                      .toArray();
        
        
        
        return answer;
    }
}