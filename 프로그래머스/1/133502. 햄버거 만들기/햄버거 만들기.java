import java.util.Stack;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int n : ingredient){
            stack.push(n);
            if(stack.size()>=4){
                int s = stack.size();
                if(stack.get(s-1) == 1 && stack.get(s-2) == 3 &&
                  stack.get(s-3) == 2 && stack.get(s-4) == 1){
                    for(int i = 0; i<4; i++) stack.pop();
                    answer++;
                }
            }
        }
        return answer;
    }
}