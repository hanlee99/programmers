import java.util.Arrays;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int n=0;
         
        int totalP=0;
        for(int p : picks) totalP+=p*5;
        int size = (minerals.length >= totalP) ? totalP : minerals.length;
        
        int tSize = (size%5 == 0) ? size/5 : size/5+1;
        int[][] total = new int[tSize][4];
        
        for(int i=0; i<size; i++){
            int g = i/5;
            if(minerals[i].equals("diamond")) total[g][0]++;
            else if(minerals[i].equals("iron")) total[g][1]++;
            else total[g][2]++;
        }
        
        for(int i=0; i<tSize; i++){
            total[i][3] = total[i][0]*25 + total[i][1]*5 + total[i][2]*1;
        }
        
        Arrays.sort(total, (a, b) -> b[3] - a[3]);
        
        for(int i=0; i<total.length; i++){
            while(picks[n] == 0) n++; 
            
            if(n==0)    answer += total[i][0] + total[i][1] + total[i][2];
            else if(n==1)   answer += total[i][0]*5 + total[i][1] + total[i][2];
            else    answer += total[i][0]*25 + total[i][1]*5 + total[i][2];
            picks[n]--;
        }
        
        return answer;
    }
}