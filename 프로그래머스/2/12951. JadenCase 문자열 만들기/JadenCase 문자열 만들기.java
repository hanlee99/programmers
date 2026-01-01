class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        char before = ' ';
        
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            
            char temp = a;
            if(a>='A'&&a<='Z' || a>='a'&&a<='z'){
                a = (before == ' ') ? 
                    Character.toUpperCase(a) :
                    Character.toLowerCase(a);
            }
            sb.append(a);
            before = temp;
        }
        answer = sb.toString();
        return answer;
    }
}