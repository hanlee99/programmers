import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1) answer = new int[]{-1};
        else{
            ArrayList<Integer> list = new ArrayList<>();
            int[] temp = Arrays.copyOfRange(arr, 0, arr.length);
            Arrays.sort(temp);
            
            int s = temp[0];
            for(int i=0; i<arr.length; i++){
                if(s != arr[i]) list.add(arr[i]);
            }
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
        }
        return answer;
    }
}