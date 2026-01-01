import java.util.Arrays;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<spell.length; i++) 
            sb.append(spell[i]);
        char[] c = sb.toString().toCharArray();
        Arrays.sort(c);
        for(int i=0; i<dic.length; i++){
            if(c.length == dic[i].length()){
                char[] c2 = dic[i].toCharArray();
                Arrays.sort(c2);
                if(Arrays.equals(c, c2)){
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}