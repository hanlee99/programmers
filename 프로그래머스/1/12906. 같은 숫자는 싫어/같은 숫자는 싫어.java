import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        
        stack.push(arr[0]);
        for(int n : arr){
            if(stack.peek() != n) stack.push(n);
        }
        while(!stack.isEmpty()) list.add(stack.pop());
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get((list.size()-1)-i);

        return answer;
    }
}