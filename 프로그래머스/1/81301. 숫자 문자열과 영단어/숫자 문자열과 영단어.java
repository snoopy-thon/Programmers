class Solution {
    public int solution(String s) {
        String[] strArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int i = 0;
        for(String str:strArr){
            if(s.contains(str)){
                System.out.println(str + i);
                s = s.replaceAll(str,i+"");
            }
            i++;
        }
        return Integer.valueOf(s);
    }
}