import java.util.HashMap;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        HashMap<Integer, Integer> hash = new HashMap<>();
        int same = 0;
        int zero = 0;
        for(int i=0; i<win_nums.length; i++){
            if(lottos[i] == 0) zero++;
            
            hash.put(win_nums[i], 1);
            
        }
        for(int i : lottos) if(hash.containsKey(i)) same++;
        
        answer[0] = same+zero;
        if(answer[0] >6) answer[0] = 6;
        answer[1] = same;
        for(int i=0; i<answer.length; i++){
            answer[i] = 6 - answer[i] + 1;
            if(answer[i] > 6)   answer[i] = 6;
        }
        return answer;
    }
}