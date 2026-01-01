class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        int two = len/2;
        answer = len%2==0 ? 
            s.substring(two-1,two+1) : s.substring(two, two+1);
        return answer;
    }
}