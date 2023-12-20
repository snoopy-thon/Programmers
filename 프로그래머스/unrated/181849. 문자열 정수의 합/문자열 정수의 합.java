class Solution {
    public int solution(String num_str) {
        int sum = 0;
        String[] numArr = num_str.split("");
        for(String i:numArr){
            sum += Integer.parseInt(i);
        }
        return sum;
    }
}