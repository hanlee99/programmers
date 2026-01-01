import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashMap<Integer, Integer> hash = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(!hash.containsKey(sum)){
                    hash.put(sum, 1);
                    list.add(sum);
                }
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) 
            answer[i] = list.get(i);
        Arrays.sort(answer);
        return answer;
    }
}