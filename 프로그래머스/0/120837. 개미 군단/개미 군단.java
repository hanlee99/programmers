class Solution {
    public int solution(int hp) {
        int answer = 0;
        int cur_hp = hp;
        if(cur_hp >=5) {
            answer+=cur_hp/5;
            cur_hp%=5;
        }
        if(cur_hp>=3 ){
            answer += cur_hp/3;
            cur_hp%=3;
        }
        if(cur_hp>0){
            answer+=cur_hp;
        }
        
        return answer;
    }
}