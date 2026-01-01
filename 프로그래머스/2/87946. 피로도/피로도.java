class Solution {
    private int k;
    private int[][] dungeons;
    private boolean[] visited;
    private int answer;
    private int max;
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        max=0;
        this.dungeons = dungeons;
        this.k = k;
        visited = new boolean[dungeons.length];
       
        dfs();
        return answer;
    }
    private void dfs(){
        answer = Math.max(answer, max);
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i]&&k>=dungeons[i][0]){
                k-=dungeons[i][1];
                visited[i] = true;
                max++;
                dfs();
                
                k+=dungeons[i][1];
                visited[i] = false;
                max--;
            }
        }
    }
}