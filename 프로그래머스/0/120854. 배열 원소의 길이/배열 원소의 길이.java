import java.util.ArrayList;
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<strlist.length; i++)
            list.add(strlist[i].length());
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}