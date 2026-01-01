class Solution {
    public int solution(String s) {
        int answer = 0;
        int before=0;
        int sign=1;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= '0' && c<= '9'  ) {
                sb.append(c);
            }else if(c == '-') sign=-1;
            else if(sb.length() !=0 && c== ' '){
                before = Integer.parseInt(sb.toString()) * sign;
                answer+=before;
                sign=1;
                sb.setLength(0);
            }else if(c=='Z') answer-=before;
        }
        if(sb.length() != 0) 
            answer+=Integer.parseInt(sb.toString())*sign;
        
        return answer;
    }
}