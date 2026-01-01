import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> hash = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            String type = clothes[i][1];
            
            hash.put(type, hash.getOrDefault(type, 0) + 1);
        }
        
        for(Integer count : hash.values()){
            answer*=count+1;
        }
        
        return answer-1;
    }
}