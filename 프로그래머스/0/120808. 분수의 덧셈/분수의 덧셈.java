class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        answer = new int[2];
        int gcd1 = gcd(denom1,denom2);
        int gi = denom1 / gcd1 * denom2;
        numer1 = gi / denom1 * numer1;
        numer2 = gi / denom2 * numer2;
        answer[0] = numer1+numer2; 
        answer[1] = gi;
        gcd1 = gcd(answer[0], answer[1]);
        answer[0] /= gcd1;
        answer[1] /= gcd1;
        
        return answer;
    }
    private int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}