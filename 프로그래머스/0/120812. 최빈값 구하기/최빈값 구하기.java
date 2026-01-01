import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        int answer = array[0];  int cntMax = 0;
        int before = array[0];  int count = 1;  int max = 1;
        for(int i=1; i<array.length; i++){
            if(before == array[i]){
                count++;
            }else{
                if(count > max){
                    max = count;
                    answer = before;
                    cntMax = 1;
                }else if(count == max){
                    cntMax++;
                }
                count = 1;
                before = array[i];
            }            
        }
        if (count > max) {
            answer = before;
            cntMax = 1;
        } else if (count == max) {
            cntMax++;
        }
        answer = cntMax > 1 ? -1 : answer;
        return answer;
    }
}