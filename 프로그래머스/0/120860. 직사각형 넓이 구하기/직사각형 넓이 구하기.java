class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int a = (dots[0][0] != dots[1][0]) ? 
            Math.abs(dots[0][0]-dots[1][0]) :
            Math.abs(dots[0][0] - dots[2][0]);
        int b = (dots[0][1] != dots[1][1]) ? 
            Math.abs(dots[0][1]-dots[1][1]) :
            Math.abs(dots[0][1] - dots[2][1]);
        
        answer = a*b;
        return answer;
    }
}