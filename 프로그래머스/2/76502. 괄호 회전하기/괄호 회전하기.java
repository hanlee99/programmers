import java.util.Stack;
class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean flag = false;
        
        for(int i=0; i<s.length(); i++){
            Stack<Character> stack = new Stack<>();
            flag = false;
            for(int j=0; j<s.length(); j++){
                int k = (j+i)%s.length();
                char c = s.charAt(k);
                if(stack.isEmpty() || c == '(' || c == '[' || c == '{'){
                    stack.push(c);
                }else{
                    char t = stack.peek();
                    if(t == '(' && c == ')'){
                        stack.pop();
                    }else if(t == '[' && c == ']'){
                        stack.pop();
                    }else if(t == '{' && c == '}'){
                        stack.pop();
                    }else flag = true;       
                }
                if(flag) break;
            }
            if(stack.isEmpty()) answer++;
        }
        return answer;
    }
}