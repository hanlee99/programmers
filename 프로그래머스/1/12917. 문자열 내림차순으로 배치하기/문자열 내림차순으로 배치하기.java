import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] st = new int[s.length()];
        for(int i=0; i<st.length; i++) 
            st[i] = s.charAt(i)-'A';
        Arrays.sort(st);
        StringBuilder sb = new StringBuilder();
        for(int i=st.length-1; i>=0; i--) 
            sb.append((char)(st[i]+'A'));
        answer = sb.toString();
        return answer;
    }
}