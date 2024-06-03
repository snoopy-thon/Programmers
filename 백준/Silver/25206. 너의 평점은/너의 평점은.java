import java.io.*;
import java.util.*;

class Main {
    static double calculateScore(String grade){
        double score = 0;
        if(grade.equals("A+")){
            score = 4.5;
        } else if(grade.equals("A0")){
            score = 4.0;
        } else if(grade.equals("B+")){
            score = 3.5;
        } else if(grade.equals("B0")){
            score = 3.0;
        } else if(grade.equals("C+")){
            score = 2.5;
        } else if(grade.equals("C0")){
            score = 2.0;
        } else if(grade.equals("D+")){
            score = 1.5;
        } else if(grade.equals("D0")){
            score = 1.0;
        }else if(grade.equals("F")){
            score = 0.0;
        }

        return score;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double score = 0;
        int totalGrade = 0;
        double avr = 0;
        for(int i=0; i<20; i++) {
            String[] arr = new String[3];
            String n = br.readLine();
            StringTokenizer st = new StringTokenizer(n);
            arr[0]=st.nextToken();
            arr[1]=st.nextToken();
            arr[2]=st.nextToken();
            //System.out.printf("arr[1]:%s, arr[2]:%s",arr[1],arr[2]);
            score = calculateScore(arr[2]);
            if(!arr[2].equals("P")) {
                sum += Double.parseDouble(arr[1]) * score;
                totalGrade += Double.parseDouble(arr[1]);
            }
        }

        avr = sum/totalGrade;
        System.out.println(avr);



    }
}




