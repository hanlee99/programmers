import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern = { {1,2,3,4,5},
                            {2,1,2,3,2,4,2,5},
                            {3,3,1,1,2,2,4,4,5,5} };
        int[] answer = new int[3];
        ArrayList<Integer> list = new ArrayList<>();
        int max = 0;
        for(int i=0; i<pattern.length; i++){
            for(int j=0; j<answers.length; j++){
                if(answers[j] == pattern[i][j%pattern[i].length])
                    answer[i]++;
            }
            max = Math.max(max, answer[i]);
        }
        for(int i=0; i<answer.length; i++){
            if(answer[i] >= max) list.add(i);
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) answer[i] = list.get(i)+1;
        
        return answer;
    }
}