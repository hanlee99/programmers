import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i=0; i<score.length/m; i++){
            int min = score[(score.length-m)-i*m];
            answer += min<=k ? min*m : k*m;
        }
        
        return answer;
    }
}