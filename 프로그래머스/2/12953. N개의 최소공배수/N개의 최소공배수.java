class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int a = arr[0];
        for(int i=1; i<arr.length; i++){
            int b = arr[i];
            int g = gcd(a,b);
            a = a/g*b;
        }
        answer=a;
        return answer;
    }
    private int gcd(int a, int b){
        if(a < b) return gcd(b, a);
        
        if(b == 0) return a;
        else return gcd(b, a%b);
    }
}