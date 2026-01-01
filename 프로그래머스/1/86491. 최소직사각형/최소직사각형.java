class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxr = 0;
        int maxc = 0;
        for(int i=0; i<sizes.length; i++){
            
            maxr = Math.max(maxr, Math.max(sizes[i][0],sizes[i][1]));
            maxc = Math.max(maxc, Math.min(sizes[i][0],sizes[i][1]));
        }
        answer = maxr*maxc;
        return answer;
    }
}