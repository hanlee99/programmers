class Solution {
    public int solution(int order) {
        int answer = 0;
        int i=order;
        int n=0;
        while(i >0){
            n = i % 10;
            if(n==3 || n==6 || n==9) answer++;
            i /= 10;
        }
        return answer;
    }
}