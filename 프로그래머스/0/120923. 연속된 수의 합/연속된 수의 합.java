import java.util.ArrayList;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        answer = new int[num];
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int last_num = (total/num) + num/2;
        for(int i=num-1; i > -1; i--){
            answer[i] += last_num;
            last_num--;
        }
        
        return answer;
    }
}