class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        int three = n;
        while(n>=3){
            sb.append(n%3);
            n/=3;
            if(n<3) sb.append(n);
        }
        int j=1;
        for(int i=sb.length()-1; i>=0; i--){
            answer += (sb.charAt(i)-'0')*j;
            j*=3;
        }
        if(three < 3) answer = three;
        return answer;
    }
}