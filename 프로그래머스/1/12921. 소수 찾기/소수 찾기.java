import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean flag = true;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        for(int i=3; i<=n; i+=2){
            flag = true;
            for(int j=0; list.get(j)*list.get(j) <=i; j++){
                if(i % list.get(j) == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer++;
                list.add(i);
            }
        }
        return answer;
    }
}