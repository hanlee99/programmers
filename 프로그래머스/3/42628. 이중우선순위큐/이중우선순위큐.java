import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = 
            new PriorityQueue<>(Collections.reverseOrder());
        for(String st : operations){
            String[] spt = st.split(" ");
            if(spt[0].equals("I")){
                int num = spt[1].charAt(0)!='-' ? 
                    Integer.parseInt(spt[1]) : 
                    Integer.parseInt(spt[1].substring(1))*-1;
                minHeap.offer(num);
                maxHeap.offer(num);
            }else{
                if(minHeap.size() == 0) continue;
                if(spt[1].charAt(0) != '-'){
                    int target = maxHeap.poll();
                    minHeap.remove(target);
                }else{
                    int target = minHeap.poll();
                    maxHeap.remove(target);
                }
            }
        }
        if(minHeap.size() == 0){
            answer[0]=0;
            answer[1]=0;
        }else{
            answer[0]=maxHeap.poll();
            answer[1]=minHeap.poll();
        }
        return answer;
    }
}