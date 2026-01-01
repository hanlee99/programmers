class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        
        if(n == 1) answer = new int[][]{{1}};
        else{
            answer = new int[n][n];
            for(int i=0; i<n; i++){
                answer[i][i] = 1;
            }
        }
        return answer;
    }
}