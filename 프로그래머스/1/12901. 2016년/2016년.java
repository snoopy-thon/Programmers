class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] numberOfDaysPerMonth = {31,29,31,30,31,30,31,31,30,31,30,31};
        int sumOfDays = 0;
        
        for(int i=0; i<a-1; i++){
            sumOfDays += numberOfDaysPerMonth[i];    
        }
        
        int r = (sumOfDays + b - 1) % 7;
        
        return days[r];
    }
}