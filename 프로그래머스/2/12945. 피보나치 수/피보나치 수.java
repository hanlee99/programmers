class Solution {
    public int solution(int n) {
        int answer = 0;
        
        final int MOD = 1234567;
        
        int a=0;    int b=1;
        
        for(int i=2; i<=n; i++) {
            int c = (a+b) % MOD;
            a = b;
            b = c;
        }
        answer = b;
        return answer;
    }
}