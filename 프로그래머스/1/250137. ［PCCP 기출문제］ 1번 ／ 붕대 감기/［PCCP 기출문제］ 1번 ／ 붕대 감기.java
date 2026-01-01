class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int last = attacks[attacks.length-1][0];
        int count=0;
        int atk=0;
        int hp = health;
        for(int i=1; i<=last; i++){
            if(attacks[atk][0] == i){
                count=0;
                hp -= attacks[atk][1];
                atk++;
            }else{
                count = count+1>bandage[0] ? 1 : count+1;
                hp += count == bandage[0] ? bandage[1]+bandage[2] :
                        bandage[1];
            }
            if(hp <= 0) break;
            if(hp>health) hp = health;
        }
        answer = hp>0 ? hp : -1;
        return answer;
    }
}