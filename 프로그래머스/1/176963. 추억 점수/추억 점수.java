import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(int i=0; i<name.length; i++){
            hash.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            int point = 0;
            for(int j=0; j<photo[i].length; j++){
                if(hash.containsKey(photo[i][j])) 
                    point += hash.get(photo[i][j]);
            }
            answer[i] = point;
        }
        
        return answer;
    }
}