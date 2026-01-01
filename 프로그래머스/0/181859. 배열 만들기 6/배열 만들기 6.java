import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length){
            if(stk.size() == 0) stk.add(arr[i++]);
            else if(stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);
                i++;
            }
            else if(stk.size() > 0 &&stk.get(stk.size()-1) != arr[i]){
                stk.add(arr[i++]);
            }
        }
        if(stk.size() == 0) answer = new int[]{-1};
        else{
            answer = new int[stk.size()];
            for(int j=0; j<stk.size(); j++) answer[j] = stk.get(j);
        }
        
        return answer;
    }
}