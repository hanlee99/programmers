import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=2; i<=n; i++){
            int m=i;
            for(int j=0; j<list.size(); j++){
                if(m % list.get(j) == 0){
                    m=0;
                    break;
                }
            }
            if(m!=0 && n%m == 0) list.add(m);
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}