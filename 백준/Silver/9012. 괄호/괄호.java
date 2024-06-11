import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        String[] inputs = new String[t];

        int rightCount;
        int leftCount;
        String result;

        for(int k=0; k<t; k++) {
            inputs[k] = br.readLine();
        }

        for (int i = 0; i < t; i++) {
            // 테스트 케이스마다 모든 변수를 초기화 해줘야 함.
            // stack 초기화 안해서 디버깅 엄청 오래걸림.
            rightCount = 0;
            leftCount = 0;
            result = "YES";
            stack.clear();

            for(int j=0; j<inputs[i].length(); j++) {
                stack.push(inputs[i].charAt(j));
            }

            while (!stack.isEmpty()) {
                if (stack.peek()==')') {
                    stack.pop();
                    leftCount++;
                } else if(stack.peek()=='(') {
                    stack.pop();
                    rightCount++;
                    if (leftCount < rightCount) {
                        result = "NO";
                        break;
                    } else {
                        leftCount--;
                        rightCount--;
                    }
                }
            }
            
            if(leftCount!=0 && rightCount==0) {result = "NO";}
            System.out.println(result);
        }
    }
}



