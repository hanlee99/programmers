class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0;
        int y_cnt = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'p' || c == 'P') p_cnt++;
            else if(c == 'y' || c == 'Y') y_cnt++;
        }
       answer = y_cnt==p_cnt ? true : false; 
       
        return answer;
    }
}