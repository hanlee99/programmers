class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        if(len == 4 || len == 6){
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(c > '9' || c < '0'){
                    answer = false;
                    break;
                }
            }
        }else answer = false;
        
        return answer;
    }
}