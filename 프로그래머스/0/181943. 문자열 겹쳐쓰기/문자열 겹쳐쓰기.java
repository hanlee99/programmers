class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char c[] = my_string.toCharArray();
        
        for(int i=0; i<overwrite_string.length(); i++)
            c[s+i] = overwrite_string.charAt(i);
        
        answer += new String(c);
        return answer;
    }
}