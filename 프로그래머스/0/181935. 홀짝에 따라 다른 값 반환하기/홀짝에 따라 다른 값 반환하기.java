class Solution {
    public int solution(int n) {
        int answer = 0;
        int m=n/2;
        answer = (n%2 == 1) ? (m+1)*(m+1) :
                    (4*(m)*(m+1)*(2*m+1)/6); 
        
        return answer;
    }
}