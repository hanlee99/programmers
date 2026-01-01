import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        Set<String> hash = new HashSet<>();
        int x=0;    int y=0;
        
        for(int i=0; i<dirs.length(); i++){
            char c = dirs.charAt(i);
            int gx=0;   int gy=0;
            
            if(c=='U')      gy=1;
            else if(c=='D') gy=-1;
            else if(c=='R') gx=1;
            else if(c=='L') gx=-1;
            
            if( x+gx>=-5&&x+gx<=5 && y+gy>=-5&&y+gy<=5){
                int nx = x+gx;
                int ny = y+gy;
                
                String star = x+","+y   + "|" + nx+","+ny;
                String goal =  nx+","+ny + "|" + x+","+y;
                                    
                if(hash.add(star) && hash.add(goal)){
                    answer++;
                }
                x=nx;   y=ny;
            }
            
        }
        return answer;
    }
}