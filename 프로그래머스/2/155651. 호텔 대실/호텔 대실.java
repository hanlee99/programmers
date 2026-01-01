import java.util.PriorityQueue;
import java.util.Arrays;
class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] time =new int[book_time.length][2];
        for(int i=0; i<book_time.length; i++){
            String[] stz = book_time[i][0].split(":");
            String[] sto = book_time[i][1].split(":");
            time[i][0]=Integer.parseInt(
                stz[0])*60+Integer.parseInt(stz[1]);
            time[i][1]=Integer.parseInt(
                sto[0])*60+Integer.parseInt(sto[1]);
        }
        PriorityQueue<Integer> room = new PriorityQueue<>();
        Arrays.sort(time, (a,b) -> a[0] - b[0]);
        
        for(int i=0; i<time.length; i++){
            int start = time[i][0];
            int end = time[i][1];
            while(!room.isEmpty() && room.peek()+10<=start){
                room.poll();
            }
            room.add(end);
            answer = Math.max(answer, room.size());
        }
        
        return answer;
    }
}