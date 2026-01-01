class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        for(int i=0; i<before.length(); i++){
            if(before.replace(after.charAt(i)+"","").length() != 
               after.replace(after.charAt(i)+"", "").length()){
                answer = 0;
                break;
            }
        }
        return answer;
    }
}