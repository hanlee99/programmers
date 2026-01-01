import java.util.Stack;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> stack = new Stack<>();        
        int cnt=0;
        for(int i=0; i<number.length(); i++){            
            char c=number.charAt(i);
            while(!stack.isEmpty() && stack.peek()<c && cnt<k){
                stack.pop();
                cnt++;
            }
            stack.push(c);
        }
        while(cnt<k){
            stack.pop();
            cnt++;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        answer = sb.reverse().toString();
        return answer;
    }
}