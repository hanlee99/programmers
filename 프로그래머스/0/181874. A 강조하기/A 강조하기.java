class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char c;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'a' || 
               myString.charAt(i) == 'A') c = 'A';
            else if(Character.isUpperCase(myString.charAt(i))) 
               c = Character.toLowerCase(myString.charAt(i));
            else c = myString.charAt(i);
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}