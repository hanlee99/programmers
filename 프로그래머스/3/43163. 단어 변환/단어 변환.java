import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        Queue<String[]> queue = new LinkedList<>();
        queue.add(new String[]{begin, ""+0});
        boolean[] visited = new boolean[words.length];
        
        for(int i=0; i<words.length; i++){
            map.put(words[i], i);
        }        
        if(!map.containsKey(target)) return 0;
        while(!queue.isEmpty()){
            String[] q = queue.poll();
            String word = q[0];
            int count = Integer.parseInt(q[1]);
            if(word.equals(target)) {
                answer = count;
                break;
            }
            for(String compare : words){
                int cnt=0;
                for(int i=0; i<word.length(); i++){
                    char a = word.charAt(i);
                    char b = compare.charAt(i);
                    if(a!=b) cnt++;
                }
                if(cnt!=1) continue;
                if(map.containsKey(compare)&&
                    !visited[map.get(compare)]){
                    visited[map.get(compare)] = true;
                    queue.add(
                        new String[]{compare, ""+(count+1)});
                        
                }
            }
        }
        
        return answer;
    }
}