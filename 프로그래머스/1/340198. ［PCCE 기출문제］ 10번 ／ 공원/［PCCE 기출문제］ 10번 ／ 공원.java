import java.util.Arrays;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        int row = park.length;
        int col = park[0].length;
        Arrays.sort(mats);
        for(int k=mats.length-1; k>=0; k--){
            int size = mats[k];
            for(int i=0; i<=row-size; i++ ){
                for(int j=0; j<=col-size; j++){
                
                    boolean flag = true;
                    for(int m=0; m<size; m++){
                        for(int n=0; n<size; n++){
                            if(!park[m+i][n+j].equals("-1")) {
                                flag = false;
                                break;
                            }
                        }
                        if(!flag) break;
                    }
                    if(flag) return size;
                }
            }
        }
    
        return -1;
    }
}