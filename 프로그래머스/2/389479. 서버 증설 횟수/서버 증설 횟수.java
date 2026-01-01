import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        int serv=0;
        
        for(int i=0; i<players.length; i++){
            while(!queue.isEmpty()){
                int[] q = queue.peek();
                if(q[0]==i){
                    queue.poll();
                    serv-=q[1];
                }else{
                    break;
                }
                
            }   
            int max = serv*m+m-1;
            if(max<players[i]){
                int add = (players[i]-max)%m==0 ? 
                    (players[i]-max)/m : (players[i]-max)/m+1;
                serv+=add;
                answer+=add;
                queue.add(new int[]{i+k,add});
            }
        }
        return answer;
    }
}