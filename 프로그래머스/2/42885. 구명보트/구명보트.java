import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        boolean[] out = new boolean[people.length];
        int j=0;
        for(int i=people.length-1; i>j; i--){
            if(out[i] == true) continue;
            if(people[j]+people[i] <= limit) {
                out[j] = true;
                out[i] = true;
                j++;
                answer++;
            }
            
        }
        for(int i=0; i<out.length; i++){
            if(!out[i]) answer++;
        }
        return answer;
    }
}