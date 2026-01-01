import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int c=0;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++){
            queue.add(new int[]{i, priorities[i]});
        }
        int[] res = Arrays.stream(priorities)
                          .distinct()
                          .boxed()
                          .sorted(Comparator.reverseOrder())
                          .mapToInt(Integer::intValue)
                          .toArray();
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int k : priorities) map.put(k, map.getOrDefault(k, 0)+1);
        
        while(!queue.isEmpty()){
            int max = res[c];
            int[] q = queue.poll();
            int key = q[1];
            int val = map.get(q[1]);
            if(max == q[1]) {
                answer++;
                val--;
                map.put(key, val);
                if(val == 0) c++; 
                if(q[0] == location) break;
            } else queue.add(q);
        }
        return answer;
    }
}