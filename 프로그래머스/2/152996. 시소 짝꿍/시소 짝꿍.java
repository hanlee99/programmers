import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Integer, Long> hash = new HashMap<>();
        Arrays.sort(weights);
        for(int w : weights){
            hash.put(w, hash.getOrDefault(w,0L) +1);
        }
        
        for(int w : hash.keySet()){
            long c = hash.get(w);
            
            if(c>1) answer+=(c*(c-1) /2);
            
            if(hash.containsKey(w*2)) answer += c*hash.get(w*2);
            if(hash.containsKey(w*3/2) && w*3%2==0)
                answer += c*hash.get(w*3/2);
            if(hash.containsKey(w*4/3) && w*4%3==0)
                answer+=c*hash.get(w*4/3);
        }
        return answer;
    }
}