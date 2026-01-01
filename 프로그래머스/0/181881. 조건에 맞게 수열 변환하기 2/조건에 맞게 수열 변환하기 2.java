import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            int count = 0;
            temp = arr[i];
            while(true){
                if(arr[i] >= 50 && arr[i] % 2 == 0) 
                    temp = arr[i] / 2;
                else if(arr[i] < 50 && arr[i] % 2 == 1)
                    temp = arr[i]*2 + 1;
                if(temp == arr[i]) break;
                else{
                    arr[i] = temp;
                    count++;
                }
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }
}