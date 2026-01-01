class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length][land[0].length];
        for(int j=0; j<4; j++){
            dp[0][j] = land[0][j];
        }
        
        for(int i=1; i<land.length; i++){
            for(int j=0; j<4; j++){
                int maxPrev = 0;
                for(int k=0; k<4; k++){
                    if(k!=j)
                        maxPrev = Math.max(dp[i-1][k], maxPrev);
                }
                dp[i][j] = maxPrev+land[i][j];
            }
        }
        for(int j=0; j<4; j++){
            answer = Math.max(answer, dp[dp.length-1][j]);
        }

        return answer;
    }
}