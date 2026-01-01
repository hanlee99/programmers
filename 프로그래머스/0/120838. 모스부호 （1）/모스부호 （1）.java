class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] st = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb = new StringBuilder();
        String[] st2 = letter.split(" ");
        
        for(int i=0; i<st2.length; i++){
            for(int j=0; j<st.length; j++){
                if(st2[i].equals(st[j])){
                    sb.append((char)(j+'a'));
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}