import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        String st = myStr.
                    replaceAll("b", "a").
                    replaceAll("c","a").
                    replaceAll("([a])\\1{1,}", "$1");
        if(st.charAt(0) == 'a') st = st.substring(1);
        if(st.length() == 0)    answer = new String[]{"EMPTY"};
        else answer = st.split("a");
        
        return answer;
    }
}