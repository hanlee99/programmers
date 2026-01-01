import java.util.ArrayDeque;

class Solution {
    static int n;
    static int m;
    public int solution(int[][] maps) {
        int answer = -1;
        
        n=maps.length;
        m=maps[0].length;
        if(n==0 && m==0) return 1;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int[] dx = {1,0,-1,0};
        int[] dy = {0,-1,0,1};
        queue.offer(new int[]{0,0});
        
        while(!queue.isEmpty()){
            int[] curr=queue.poll();
            
            for(int dir=0; dir<4; dir++){
                int nx=curr[0]+dx[dir];
                int ny=curr[1]+dy[dir];
                if(isRange(nx, ny) && maps[nx][ny]==1 ){
                    if(nx==n-1 && ny==m-1){
                        return maps[curr[0]][curr[1]]+1;
                    }
                    maps[nx][ny] += maps[curr[0]][curr[1]];
                    queue.offer(new int[]{nx, ny});
                }
            }
                
        }
        return answer;
    }
    private boolean isRange(int x, int y){
        return x>=0 && x<n && y>=0 && y<m;
    }
}