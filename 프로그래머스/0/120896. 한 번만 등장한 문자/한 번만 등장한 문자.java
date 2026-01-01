class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char c;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            count = 0;
            for(int j=0; j<s.length(); j++)
                if(c == s.charAt(j)) count++;
            if(count == 1) sb.append(c);
        }
        for(int i=0; i<sb.length()-1; i++){
            for(int j=sb.length()-1; j>i; j--)
                if(sb.charAt(i) > sb.charAt(j)){
                    c = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, c);
                }
        }
        answer = sb.toString();
        return answer;
    }
}