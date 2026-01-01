class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int row=0;  int col=0;
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        for(int i=0; i<routes.length; i++){
            char c = routes[i].charAt(0);
            int n = routes[i].charAt(2)-'0';
            int dir_row = 0;    int dir_col = 0;
            if(c == 'N')        dir_row -= n;
            else if(c == 'S')   dir_row+=n;
            else if(c == 'W')   dir_col-=n;
            else if(c == 'E')   dir_col+=n;
            
            if( dir_row+row >-1 && dir_row+row<park.length &&
              dir_row != 0){
                int j = dir_row > 0 ? 1 : -1;
                for(int k=j; k*j <= dir_row*j; k+=j){
                    if(park[row+k].charAt(col) == 'X'){
                        dir_row =0;
                        break;
                    }
                }
                row+=dir_row;
            }else if(dir_col+col >-1 && 
                     dir_col+col<park[row].length() && dir_col!=0){
                int j = dir_col>0 ? 1 : -1;
                for(int k=j; k*j <= dir_col*j; k+=j){
                    if(park[row].charAt(col+k) == 'X'){
                        dir_col =0;
                        break;
                    }
                }
                col+=dir_col;
            }
        }
        answer = new int[]{row,col};
        return answer;
    }
}