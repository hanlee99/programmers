import java.util.HashMap;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        answer = new int[targets.length];
        HashMap<Character,Integer> hash = new HashMap<>();
        
        for(int i=0; i<keymap.length; i++){
            String s = keymap[i];
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                if(hash.containsKey(c)){
                    if(hash.get(c) > j+1)
                        hash.put(c, j+1);
                }else{
                    hash.put(c, j+1);
                }
            }
        }
        for(int i=0; i<targets.length; i++){
            int count = 0;
            for(int j=0; j<targets[i].length(); j++){
                char c = targets[i].charAt(j);
                if(hash.containsKey(c)){
                    count+=hash.get(c);
                }else{
                    count=-1;
                    break;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}