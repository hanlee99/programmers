import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        int num = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++){
            num = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(k < num) list.add(num);
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i); 
        return answer;
    }
}