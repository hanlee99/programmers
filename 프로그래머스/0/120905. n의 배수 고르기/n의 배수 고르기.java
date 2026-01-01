import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : numlist) 
            if(i >= n && i%n == 0) list.add(i);
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}