import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        answer = new int[k];
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(list.size() == k) break;
            count = 0;
            for(int j=0; j<list.size(); j++){
                if(list.get(j) == arr[i]) {
                    count++;
                    break;
                }
            }
            if(count == 0) list.add(arr[i]);
        }
        if(list.size() < k) 
            for(int i=0; i<k; i++) list.add(-1);
        for(int i=0; i<k; i++)  answer[i] = list.get(i);
        return answer;
    }
}