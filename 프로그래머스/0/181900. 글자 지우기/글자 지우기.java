class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        for(int i=0; i<indices.length; i++){
            sb.setCharAt(indices[i], '0');
        }
        answer = sb.toString();
        answer = answer.replace(Character.toString('0'), "");
        
        
        return answer;
    }
}