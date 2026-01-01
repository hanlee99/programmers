import java.util.Stack;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int cur_idx = k;
        boolean[] chart = new boolean[n];
        int[] prev = new int[n];
        int[] next = new int[n];

        for (int i = 0; i < n; i++) {
            prev[i] = i - 1;
            next[i] = i + 1;
        }
        
        for(int i=0; i<cmd.length; i++){
            char c = cmd[i].charAt(0);
            int sign = 1;
            if(c == 'C'){
                stack.push(cur_idx);
                chart[cur_idx] = true;
                
                if(prev[cur_idx] != -1) next[prev[cur_idx]] = next[cur_idx];
                if(next[cur_idx] != n)  prev[next[cur_idx]] = prev[cur_idx];
                
                cur_idx = (next[cur_idx] != n) ? next[cur_idx] : prev[cur_idx];
            }else if(c == 'Z'){
                int re = stack.pop();
                chart[re] = false;
                
                if (prev[re] != -1) next[prev[re]] = re;
                if (next[re] != n) prev[next[re]] = re;
            }else{
                int count = Integer.parseInt(cmd[i].substring(2)); 
                while (count-- > 0) {
                cur_idx = (c == 'U') ? prev[cur_idx] : next[cur_idx];
                }
            }
        }
        for(boolean t : chart){
            char c = t ? 'X' : 'O';
            sb.append(c);
        }
        answer = sb.toString();   
        return answer;
    }
}