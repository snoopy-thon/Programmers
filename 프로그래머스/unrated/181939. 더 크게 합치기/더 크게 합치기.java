class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = Integer.toString(a);
        String num2 = Integer.toString(b);
        String number1 = num1 + num2;
        String number2 = num2 + num1;
        int result1 = Integer.parseInt(number1);
        int result2 = Integer.parseInt(number2);
        return (result1 > result2) ? result1 : result2;
    }
}