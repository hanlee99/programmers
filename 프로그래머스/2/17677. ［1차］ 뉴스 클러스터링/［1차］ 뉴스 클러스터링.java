import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        int inter=0;
        int union=0;
        Set<String> set = new HashSet<>();
        Map<String, Integer> mapA = new HashMap<>();
        Map<String, Integer> mapB = new HashMap<>();
        
        for(int i=0; i<str1.length()-1; i++){
            char c1=str1.charAt(i);
            char c2=str1.charAt(i+1);
            if(isCase(c1) && isCase(c2)){
                String key = c1+""+c2;
                set.add(key);
                mapA.put(key, mapA.getOrDefault(key,0) + 1);
            }
        }
        for(int i=0; i<str2.length()-1; i++){
            char c1=str2.charAt(i);
            char c2=str2.charAt(i+1);
            if(isCase(c1) && isCase(c2)){
                String key = c1+""+c2;
                set.add(key);
                mapB.put(key, mapB.getOrDefault(key,0) + 1);
            }
        }
        for(String key : set){
            inter += Math.min(mapA.getOrDefault(key,0),
                             mapB.getOrDefault(key, 0));
            union += Math.max(mapA.getOrDefault(key, 0),
                             mapB.getOrDefault(key, 0));
        }
        answer = (union == 0) ? 65536 : (int)((double)inter / union * 65536);
        return answer;
    }
    
    private boolean isCase(char c){
        return c>='a' && c<='z';
    }
    
}