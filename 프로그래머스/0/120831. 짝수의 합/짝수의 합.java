class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = n*(n+1) / 2 ;
        answer = (answer%2 == 0) ? 
            sum - ((n-1)/2 +1)*((n-1)/2 +1) : sum - (n/2+1)*(n/2+1);
        return answer;
    }
}