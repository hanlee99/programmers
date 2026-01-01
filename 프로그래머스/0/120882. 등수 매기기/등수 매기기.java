import java.util.Arrays;
class Solution {
    public int[] solution(int[][] score) {
        double[] mid = new double[score.length];
        int[] idx = new int[score.length];
        int[] answer = new int[score.length];
        int rank = 1;
        for(int i=0; i<score.length; i++){
            mid[i] = (score[i][0]+score[i][1])/2.0;
            idx[i] = i;
        }
        for(int i=0; i<mid.length-1; i++){
            for(int j=mid.length-1; j>i; j--){
                if(mid[i]<mid[j]){
                    double temp=mid[i];
                    mid[i] = mid[j];
                    mid[j] = temp;
                    int ix = idx[i];
                    idx[i] = idx[j];
                    idx[j] = ix;
                }
            }
        }
        answer[idx[0]] = 1;
        for(int i=1; i<answer.length; i++){
            
            if(mid[i-1] == mid[i]) {
                answer[idx[i]] = answer[idx[i-1]];
            }else{
                answer[idx[i]] = i+1;
            }
            
            
        }
        
        return answer;
    }
}