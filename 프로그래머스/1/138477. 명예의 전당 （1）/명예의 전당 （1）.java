import java.util.Arrays;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        answer = new int[score.length];
        int[] sc = new int[k];
        sc[0] = score[0];
        int idx = 0;
        for(int i=0; i<score.length; i++){
            int last = k;
            if(i < k){
                sc[i] = score[i];
                last = i+1;
            }else{
                sc[0] = sc[0] < score[i] ? score[i] : sc[0];
            }
            Arrays.sort(sc,0, last);
            answer[i] = sc[0];
            
        }
        return answer;
    }
}