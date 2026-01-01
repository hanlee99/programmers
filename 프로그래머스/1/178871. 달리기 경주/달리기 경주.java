import java.util.HashMap;
import java.util.Map;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> rank = new HashMap<>();
        for(int i=0; i<players.length; i++) 
            rank.put(players[i], i);
        
        for(int i=0; i<callings.length; i++){
            int idx = rank.get(callings[i]);
            String temp = new String(players[idx-1]);
            players[idx-1] = players[idx];
            players[idx] = temp;
            rank.put(callings[i], rank.get(callings[i])-1);
            rank.put(temp, rank.get(temp) +1);
            
        }
        answer = new String[players.length];
        for(int i=0; i<players.length; i++) answer[i] = players[i];
        return answer;
    }
}