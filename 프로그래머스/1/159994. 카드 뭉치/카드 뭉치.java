class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int count = 0;
        int o_count = 0;
        int t_count = 0;
        boolean flag = true;
        while(count < goal.length){
            int fail = 0;
            if(o_count < cards1.length &&
              goal[count].equals(cards1[o_count])){
                o_count++;
            }else fail++;
            
            if(t_count < cards2.length && 
               goal[count].equals(cards2[t_count])){
                t_count++;
            }else fail++;
            count++;
            if(fail == 2) flag = false;
        }
        answer = flag ? "Yes" : "No";
        return answer;
    }
}