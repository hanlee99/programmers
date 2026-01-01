class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.length() < pat.length()) answer = 0;
        else answer = 
            (myString.toLowerCase().
             contains(pat.toLowerCase())) ? 1 : 0; 
        return answer;
    }
}