class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int i = answer;
        if(is_prefix.length() <= my_string.length()){
            for(i=0; i < is_prefix.length(); i++){
                if(is_prefix.charAt(i) != my_string.charAt(i)) break;
            }
        }
        answer = (i == is_prefix.length()) ? 1 : 0;
        return answer;
    }
}