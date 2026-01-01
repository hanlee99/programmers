import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int t : topping){
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        for(int t : topping){
            set.add(t);
            int keyCnt = map.get(t)-1;
            if(keyCnt == 0) 
                map.remove(t);
            else
                map.put(t, keyCnt);
            
            if(set.size() == map.size()){
                answer++;
            }else if(set.size() > map.size()){
                break;
            }
        }
        
        return answer;
    }
}