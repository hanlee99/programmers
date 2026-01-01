class Solution {
    public int solution(int num, int k) {
        int answer = 1;
        String s = Integer.toString(num);
        int i;
        for(i=0; i<s.length(); i++){
            if(k==(s.charAt(i)-'0')) break;
            else answer++;
        }
        if(i==s.length()) answer = -1;
        return answer;
    }
}