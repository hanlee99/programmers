import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i%divisor == 0)
                list.add(i);
        }
        if(list.size() == 0){
            answer = new int[]{-1};
        }else{
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++)
                answer[i] = list.get(i);
        }
        return answer;
    }
}