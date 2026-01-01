class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int a = chicken;
        while(a >= 10){
            answer += a/10;
            a = a/10 + a%10;
        }
        
        return answer;
    }
}