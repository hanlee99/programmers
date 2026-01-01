class Solution {
    public int solution(int n) {
        int answer = 0;
        String sb = Integer.toString(n);
        for(int i=0; i<sb.length(); i++){
            answer += (sb.charAt(i)-'0');
        }
        return answer;
    }
}