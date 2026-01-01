import java.util.Stack;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int n=0;
        Stack<Integer> stack = new Stack<>();
        int main=1;
        int curr=0;
        while(main<=order.length){
            //System.out.println(main + " " + order[curr] + " " + answer);
            if(main == order[curr]){
                answer++;
                main++;
                curr++;
            }else if(!stack.isEmpty() && stack.peek() == order[curr]){
                stack.pop();
                answer++;
                curr++;
            }else{
                stack.push(main);
                main++;
            }
        }
        
        while(!stack.isEmpty()){
            if(stack.peek() == order[curr]){
                curr++;
                stack.pop();
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}
