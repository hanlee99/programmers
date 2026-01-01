import java.util.ArrayList;
class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        for(int i=2; i<=a&&i<=b; i++){
            if(a%i == 0 && b%i==0){
                a/=i;
                b/=i;
            }
        }
        while(b%2==0 || b%5 == 0){
            if(b%2==0) b/=2;
            if(b%5==0) b/=5;
        }
        answer = (b==1) ? 1 : 2;
                
        
        return answer;
    }
}