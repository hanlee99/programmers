import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        int i=0;
        while(i<arr.length){
            if(list.isEmpty()) list.add(arr[i++]);
            else {
                if(list.get(list.size()-1) <
                   arr[i]) list.add(arr[i++]);
                else list.remove(list.size()-1);
            }
        }
        stk = new int[list.size()];
        for(i=0; i<list.size(); i++) stk[i] = list.get(i);
        return stk;
    }
}