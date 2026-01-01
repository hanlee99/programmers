class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        answer = new int[n][n];
        
        int s = 1;
        int row = 0; int col = 0;
        for(int i=0; i<n*n; i++){
            switch(s){
                case 1:
                    answer[row][col++] = i+1;
                    if(col == n || answer[row][col] != 0){ 
                        s = 2;
                        col--;
                        row++;
                    }
                    break;
                case 2:
                    answer[row++][col] = i+1;
                    if(row == n || answer[row][col] != 0) {
                        s = 3;
                        row--;
                        col--;
                    }
                    break;
                case 3:
                    answer[row][col--] = i+1;
                    if(col == -1 || answer[row][col] != 0) {
                        s = 4;
                        col++;
                        row--;
                    }
                    break;
                case 4:
                    answer[row--][col] = i+1;
                    if(row == n || answer[row][col] != 0) {
                        s = 1;
                        row++;
                        col++;
                    }
                    break;
                    
                    
            }
            
        }
        
        
        return answer;
    }
}