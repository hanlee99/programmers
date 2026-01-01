import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int[] left = new int[progresses.length];
        int count = 0;
        for(int i=0; i<progresses.length; i++){
            int a = 100 - progresses[i];
            int b = speeds[i];
            int n = a%b == 0 ? a/b : a/b+1;
            left[i] = n;
        }
        int max = left[0];
        for(int i=0; i<left.length; i++){
            if(max >= left[i]){
                count++;
            }else{
                max = left[i];
                list.add(count);
                count = 1;
            }
        }
        list.add(count);
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}