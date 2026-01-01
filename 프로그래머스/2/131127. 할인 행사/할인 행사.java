import java.util.HashMap;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int sum = 0;
        String before = "";
        HashMap<String, Integer> hash = new HashMap<>();
        for(int i=0; i<want.length; i++) {
            hash.put(want[i], number[i]);
            sum+=number[i];   
        }
        
        for(int i=0; i<discount.length; i++){
            String p = discount[i];
            if(hash.containsKey(p)){
                if(hash.get(p) > 0) sum-=1;
                hash.put(p, hash.get(p)-1);
            }
            if(i >= 10){
                before = discount[i-10];
                if(hash.containsKey(before)){
                    if(hash.get(before) >= 0)   sum+=1;
                    hash.put(before, hash.get(before)+1);
                }
            }
            
            if(sum == 0) answer++;
        }
        return answer;
    }
}