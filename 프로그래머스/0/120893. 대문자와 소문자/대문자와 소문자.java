class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.toUpperCase();
        StringBuilder sb = new StringBuilder();
        char c;
        for(int i=0; i < my_string.length(); i++){
            c = answer.charAt(i);
            if(c == my_string.charAt(i))
                c = Character.toLowerCase(c);
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}