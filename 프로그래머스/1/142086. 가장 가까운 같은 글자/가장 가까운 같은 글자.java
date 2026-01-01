import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer = new int[s.length()];
        HashMap<Character, Integer> hash = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(hash.containsKey(c)){
                answer[i] = i-hash.get(c);
                hash.put(c, i);
            }else{
                answer[i] = -1;
                hash.put(c, i);
            }
        }
        return answer;
    }
}