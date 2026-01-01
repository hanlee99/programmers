import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String answer = "";
        int max;
        int min;
        ArrayList<Integer> list = new ArrayList<>();
        
        String[] st = s.split(" ");
        for(String num : st){
            list.add(Integer.parseInt(num));
        }
        
        Collections.sort(list);
        max=list.get(list.size()-1);
        min=list.get(0);
        
        answer = min + " " + max;
        
        return answer;
    }
}