import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        int start=0;    int end=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) list.add(arr[i]);
        for(int i=0; i<query.length; i++){
            if(i % 2 == 0){
                list.subList(query[i] + 1, list.size()).clear();
            }else{
                list.subList(0, query[i]).clear();
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
        
        return answer;
    }
}