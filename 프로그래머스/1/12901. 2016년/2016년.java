class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {0, 31, 29, 31, 30, 31, 
                       30, 31, 31, 30, 31, 30,31};
        String[] yoil = {"FRI", "SAT", "SUN", "MON",
                         "TUE","WED","THU"};
        int day=0;
        for(int i=1; i<a; i++) day+=month[i];
        day += b-1;
        answer = yoil[day%7];
        return answer;
    }
}