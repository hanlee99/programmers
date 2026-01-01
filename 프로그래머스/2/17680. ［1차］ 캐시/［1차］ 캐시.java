import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if(cacheSize==0){
            return cities.length*5;
        }
        
        int cacheHit=1;
        int cacheMiss=5;
        ArrayDeque<String> queue = new ArrayDeque<>();
        Set<String> hash = new HashSet<>();
        
        for(String city : cities){
            city = city.toLowerCase();
            
            if(hash.contains(city)){
                queue.remove(city);
                queue.offer(city);
                answer+=cacheHit;
            }else{
                if(hash.size() >= cacheSize){
                    String rm=queue.poll();
                    hash.remove(rm);
                }
                    
                queue.offer(city);
                hash.add(city);
                answer+=cacheMiss;
            }
        }
        
        return answer;
    }
}