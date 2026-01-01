import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        ArrayList<Integer> list = new ArrayList<>();
        
        int before = tangerine[0];
        int sum =0;
        for(int i=0; i<tangerine.length; i++){
            int current = tangerine[i];
            if(before == current) sum++;
            else {
                list.add(sum);
                sum=1;
            }
            before = current;
        }
        list.add(sum);
        Collections.sort(list);
        
        int result = 0;
        for(int i = list.size()-1; i >= 0; i--){
            int n = list.get(i);
            result+=n;
            answer++;
            if(result >= k) break;
        }
        
        return answer;
    }
}