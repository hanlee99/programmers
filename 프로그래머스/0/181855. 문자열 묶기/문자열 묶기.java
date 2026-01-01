import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int count = 0;
        int num[] = {};
        num = new int[strArr.length];
        for(int i=0; i<strArr.length; i++) num[i] =strArr[i].length();
        
        for(int i=0; i<num.length; i++){
            count = 0;
            for(int j=i; j<num.length; j++){
                if(num[i] == num[j]) count++;
            }
            if(answer < count) answer = count;   
        }
        
        return answer;
    }
}