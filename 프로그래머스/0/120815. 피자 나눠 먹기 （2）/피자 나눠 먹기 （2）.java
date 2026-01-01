class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = n / gcd(n, 6);
        return answer;
    }
    private int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}