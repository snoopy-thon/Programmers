class Solution {
    public int solution(String dartResult) {
        int start = 0;
        int index = 0;
        int[] sum = new int[3];
        int total = 0;
        String[] words = new String[3];
        for(int i=0; i<dartResult.length(); i++){
            char wordChar = dartResult.charAt(i);
            if(wordChar == 'S' || wordChar == 'D' || wordChar == 'T'){
                words[index] = dartResult.substring(start,i+1);
                index++;
                start = i+1;
            }
        }
        char finalChar = dartResult.charAt(dartResult.length()-1);
        if(finalChar == '#'){
            words[2] += String.valueOf(finalChar);
        }else if(finalChar == '*'){
            words[2] += "*";
        }
     
        for(int i=1; i<words.length; i++){
            char firstChar = words[i].charAt(0);
            if(firstChar == '*'){
                words[i-1] += firstChar;
                words[i] = words[i].replaceFirst("\\*", "");
            }else if(firstChar == '#'){
                words[i-1] += firstChar;
                 words[i] = words[i].replaceFirst("#", "");
            }
        }
        
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        
        for(int i=0; i<words.length; i++){
            int len = words[i].length();
            int score = 0;
            int bonusIndex = 1;
            
            if(words[i].substring(0,2).equals("10")){
                score = 10;
                bonusIndex = 2;
            }else{
                score = words[i].charAt(0)-'0';
            }
            
            if(words[i].charAt(bonusIndex) == 'S'){
                sum[i] += Math.pow(score, 1);
            }else if(words[i].charAt(bonusIndex) == 'D'){
                sum[i] += Math.pow(score, 2);
            }else if(words[i].charAt(bonusIndex) == 'T'){
                sum[i] += Math.pow(score, 3);
            }
            
           
            if(words[i].charAt(len-1) == '*'){
                sum[i] *= 2;
                if(i != 0){
                    sum[i-1] *= 2;
                }
            }else if(words[i].charAt(len-1) == '#'){
                sum[i] *= (-1);
            }
        }
        
        for(int i:sum){
            total += i;
        }
        return total;
    }
}