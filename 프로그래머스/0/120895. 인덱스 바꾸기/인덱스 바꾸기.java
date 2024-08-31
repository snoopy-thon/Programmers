class Solution {
    public String solution(String my_string, int num1, int num2) {
        // my_string을 char배열에 넣는다.
        // num1과 num2의 인덱스에 해당하는 배열값을 요구사항에 맞게 다시 할당해준다.
        
        char[] tmpArr = my_string.toCharArray();
        tmpArr[num1] = my_string.charAt(num2);
        tmpArr[num2] = my_string.charAt(num1);
        String answer = String.valueOf(tmpArr);
        return answer;
    }
}