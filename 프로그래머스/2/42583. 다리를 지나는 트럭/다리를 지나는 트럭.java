import java.util.ArrayDeque;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        /*ArrayDeque<int[]> queue = new ArrayDeque<>();
        
        int n=0;
        int cur_weight=0;
        
         while(!queue.isEmpty() || n<truck_weights.length){
            answer++;
             
            ArrayDeque<int[]> q = new ArrayDeque<>();
            while(!queue.isEmpty()){
                int[] truck = queue.poll();
                int w = truck[0];
                int cur_len = truck[1]+1;
                
                if(cur_len > bridge_length){
                    cur_weight-=w;
                }else{
                    q.offer(new int[]{w, cur_len});
                }
            }
            queue = q;
            
            if(n<truck_weights.length&&
               cur_weight+truck_weights[n]<=weight){
                
                queue.offer(new int[]{truck_weights[n], 1});
                cur_weight+=truck_weights[n];
                n++;
            }
        }
        
        return answer;*/
        
        ArrayDeque<Integer> bridge = new ArrayDeque<>();
        int time=0;
        int bridgeWeight=0;
        int idx=0;
        
        for(int i=0; i<bridge_length; i++) bridge.offer(0);
        
        while(idx < truck_weights.length){
            time++;
            bridgeWeight -= bridge.poll();
            
            if(bridgeWeight + truck_weights[idx] <= weight){
                bridge.offer(truck_weights[idx]);
                bridgeWeight += truck_weights[idx];
                idx++;
            }else{
                bridge.offer(0);
            }
        }
        return time+bridge_length;
    }
}