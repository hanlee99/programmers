import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == ')' && !stack.isEmpty() ){
                if(stack.peek() == '(') stack.pop();
            }else{
                stack.push(c);
            }
        }
        answer = stack.isEmpty();
        return answer;
    }
}