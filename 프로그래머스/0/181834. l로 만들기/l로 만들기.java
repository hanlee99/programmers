class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char c = ' ';
        for(int i=0; i<myString.length(); i++){
            c = myString.charAt(i);
            if(c < 'l') c = 'l';
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}