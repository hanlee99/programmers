class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int last_idx = common.length-1;
        if(common[2]-common[1] == common[1]-common[0]){
            answer = common[last_idx] + common[2]-common[1];
        }else{
            answer = common[last_idx] * (common[2]/common[1]);
        }
        return answer;
    }
}