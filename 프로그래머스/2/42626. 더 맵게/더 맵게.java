import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++){
            minHeap.add(scoville[i]);
        }
        
        while(minHeap.size() >= 2 && minHeap.peek() < K){
            int a = minHeap.poll();
            int b = minHeap.poll();
            int sum = a + (b*2);
            minHeap.add(sum);
            answer++;
        }
        if(minHeap.size()<=0 || 
           minHeap.size()>0&&minHeap.peek()<K) 
            answer = -1;
        return answer;
    }
}