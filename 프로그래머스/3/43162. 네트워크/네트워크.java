import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        int[] node = new int[n];
        for(int i=0; i<n; i++) node[i]=i;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(computers[i][j] == 1) queue.add(new int[]{i,j});
            }
        }
        
        while(!queue.isEmpty()){
            int[] connect = queue.poll();
            int nodeA = connect[0];
            int nodeB = connect[1];
            
            int change = node[nodeB];
            for(int i=0; i<n; i++){
                if(node[i] == change)
                    node[i] = node[nodeA];
            }
        }
        for(int i=0; i<n; i++){
            if(node[i]==i) answer++;
        }
        
        return answer;
    }
}