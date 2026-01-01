import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;  int last = arr.length - 1;
        
        for( ; start<arr.length; start++){
            if(arr[start] == 2) break;
        }
        for( ; last >= start; last--){
            if(arr[last] == 2) break;
        }
        if(start < arr.length) 
            answer = Arrays.copyOfRange(arr, start, last+1);
        else {
            answer = new int[1];
            answer[0] = -1; 
        }
        
        return answer;
    }
}