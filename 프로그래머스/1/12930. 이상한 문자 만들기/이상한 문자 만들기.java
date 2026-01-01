class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] st = s.split(" ");
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                count = 0;
                sb.append(' ');
            }else{
                
                c = (count%2==0) ? 
                    Character.toUpperCase(c) : 
                Character.toLowerCase(c);
                count++;
                sb.append(c);
            }
        }
        answer = sb.toString();
        return answer;
    }
}