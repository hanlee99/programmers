class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int col = w;
        int row = n%w == 0 ? n/w : n/w +1;
        int[][] container = new int[row][col];
        int number = 1;
        int r=0; int c=0;
        
        for(int i=row-1; i>=0; i--){
            int distance = row-1-i;
            int cur_col = distance%2 == 0 ? 0 : col-1;
            int sig = distance%2 == 0 ? 1 : -1;
            
            for(int j=cur_col; j>=0 && j<col; j+=sig){
                if(num == number){
                    r = i;
                    c = j;
                }
                container[i][j] = number;
                if(number == n) break;
                else number++;
            }
        }
        for(int i = r; i>=0; i--){
            if(container[i][c] == 0)
                break;
            else 
                answer++;
        }
        return answer;
    }
}