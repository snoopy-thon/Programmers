class Solution { 
    public int solution(int a, int b) {
        int answer = 0;
        String result = a + "" + b;
        int resultNum = Integer.parseInt(result);
        answer = resultNum >= 2 * a * b ? resultNum : 2 * a * b;
        return answer;
    }
}