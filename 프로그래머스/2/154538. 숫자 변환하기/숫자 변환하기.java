import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;
        boolean[] visited = new boolean[y+1];
        Queue<int[]> queue = new LinkedList<>();
        
        queue.add(new int[]{x,0});
        visited[x] = true;
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int val =cur[0];
            int cnt = cur[1];
            
            if(val == y) {
                answer = cnt;
                break;
            }
            
            int[] nextVals = {val+n, val*2, val*3};
            for(int next: nextVals){
                if(next <= y && !visited[next]){
                    visited[next] = true;
                    queue.add(new int[]{next, cnt + 1});
                }
            }
        }
        
        return answer;
    }
    
}