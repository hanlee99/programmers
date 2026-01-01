class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()){
            if(c == ' ') sb.append(c);
            else{
                char std = (Character.isUpperCase(c)) ?
                    'A' : 'a';
                char ap = (char)((c-std+n)%26 + std);
                sb.append(ap);
            }
        }
        answer = sb.toString();
        return answer;
    }
}