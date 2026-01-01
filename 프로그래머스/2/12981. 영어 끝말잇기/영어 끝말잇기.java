import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();
        String before = words[0];
        if(before.length() == 1) return answer;
        set.add(before);
        
        for(int i=1; i<words.length; i++){
            String cur = words[i];
            if(!check(before, cur, set)){
                answer[0] = i%n + 1;
                answer[1] = i/n + 1;
                break;
            }
            before = cur;
        }
        

        return answer;
    }
    private boolean check(String before, String cur, Set<String> set){
        if(cur.length() == 1) return false;
        
        char last = before.charAt(before.length()-1);
        char first = cur.charAt(0);
        if(first != last) return false;
        
        return set.add(cur);
    }
}