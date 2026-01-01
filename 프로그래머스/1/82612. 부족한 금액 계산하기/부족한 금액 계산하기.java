class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long c = price;
        for(int i=1; i<=count; i++){
            answer += c*i;
        }
        answer -= money;
        if(answer < 0) answer=0;
        return answer;
    }
}