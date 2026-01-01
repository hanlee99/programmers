import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        boolean flag = false;
        for(int k=0; k<moves.length; k++){
            int j=moves[k]-1;
            flag = false;
            for(int i=0; i<board.length; i++){
                if(board[i][j] != 0){
                    stack.push(board[i][j]);
                    board[i][j] = 0;
                    flag = true;
                    break;
                }
            }
            if(stack.size() >=2 && flag){
                int s = stack.size();
                if(stack.get(s-1) == stack.get(s-2)){
                    stack.pop();
                    stack.pop();
                    answer += 2;
                }
            }
        }
        return answer;
    }
}