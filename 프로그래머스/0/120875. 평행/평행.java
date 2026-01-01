class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double a=0;    double b=0;
        for(int i=0; i<dots.length-2; i++){
            
            int x1 = dots[i][0] >= 
                dots[(i+1)%(dots.length-1)][0] ? 
                i : (i+1)%(dots.length-1);
            int x2 = dots[(i+2)%(dots.length-1)][0] >= 
                dots[dots.length-1][0] ? 
                (i+2)%(dots.length-1) : dots.length-1;
            
            int x12 = x1==i ? (i+1)%(dots.length-1) : i;
            int x22 = x2==dots.length-1 ?
                (i+2)%(dots.length-1) : dots.length-1;
            if(dots[x1][0] == dots[x12][0]) a=200; 
            else if(dots[x1][1] == dots[x12][1]) a=0;
            else a = 
                (double)(dots[x1][1]-dots[x12][1])/
                (double)(dots[x1][0]-dots[x12][0]);
            
            if(dots[x2][0] == dots[x22][0]) b=200;
            else if(dots[x2][1] == dots[x22][1]) b=0;
            else b = 
                (double)(dots[x2][1]-dots[x22][1])/
                (double)(dots[x2][0]-dots[x22][0]);
            
            if(a==b) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}