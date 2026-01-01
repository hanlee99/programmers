import java.util.Arrays;
import java.util.Stack;
import java.util.Comparator;
class Solution {
    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        int n=0;
        Stack<String[]> stack = new Stack<>();
        for(int i=0; i<plans.length; i++){
            String[] hs = plans[i][1].split(":");
            plans[i][1] = String.valueOf(
                Integer.parseInt(hs[0])*60 + Integer.parseInt(hs[1]));
        }
        Arrays.sort(plans, Comparator.
                    comparingInt(a -> Integer.parseInt(a[1])));
        
        for(int i=0; i<plans.length; i++){
            int line = i+1<plans.length ? 
                Integer.parseInt(plans[i+1][1]) : 23*60+59;
            int time = Integer.parseInt(plans[i][1]);
            String[] cur = plans[i];
            
            while(time<line && cur != null){
                int play = Integer.parseInt(cur[2]);
                if(time+play == line){
                    answer[n++] = cur[0];
                    time=line;
                    cur=null;
                }else if(time+play > line){
                    int s = play- (line-time);
                    cur[2] = String.valueOf(s);
                    stack.push(cur);
                    time=line;
                    cur=null;
                }else {
                    answer[n++]=cur[0];
                    time+=play;
                    if(!stack.isEmpty() && time<line) 
                        cur = stack.pop();
                    else cur=null;
                }
            }
            if(cur!=null) stack.push(cur);
            
        }
        while(!stack.isEmpty()){
            String[] s = stack.pop();
            answer[n++] = s[0];
        }
        return answer;
    }
}