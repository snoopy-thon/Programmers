class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 1. arr1과 arr2의 각각의 배열 값을 이진수로 바꾼다.
        // 2. arr1[i] 와 arr2[i]의 이진수 값을 OR(|)연산한다.
        // 3. 연산한 값을 배열에 넣는다.
        // 4. 0은 ' '으로 1은 '#'으로 변환하여 반환한다.
        String[] tmp = new String[n];
        String[] answer = new String[n];

        for(int i=0; i<n; i++){
            answer[i] = "";
            String result = Integer.toBinaryString(arr1[i] | arr2[i]);
            tmp[i] = String.format("%"+ n +"s",result);
            // if(tmp[i].length() < n){
            //     for(int k=tmp[i].length(); k<n; k++){
            //         tmp[i] = " " + tmp[i];
            //     }
            // }
            
            for(int j=0; j<tmp[i].length(); j++){
                if(tmp[i].charAt(j) == '1'){
                    answer[i] += "#";
                } else{
                    answer[i] += " ";
                }
            }
        }
        
        
        
        return answer;
    }
}
