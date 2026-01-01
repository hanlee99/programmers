import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> s_list = new ArrayList<>();
        HashMap<String, String> hash = new HashMap<>();
        String enter = "님이 들어왔습니다.";
        String leave = "님이 나갔습니다.";
        String word = "";
        
        for(int i=0; i<record.length; i++){
            String[] s = record[i].split(" ");
            String cmd = s[0];
            String user = s[1];
            
            if(cmd.equals("Enter")){
                String nickname = s[2];
                list.add(1);
                s_list.add(user);
                hash.put(user, nickname);
            }else if(cmd.equals("Leave")){
                list.add(2);
                s_list.add(user);
            }else if(cmd.equals("Change")){
                String nickname = s[2];
                hash.put(user, nickname);
            }
        }
        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            String user = s_list.get(i);
            word = list.get(i) == 1 ? enter : leave;
            answer[i] = hash.get(user) + word;
        }
        
        return answer;
    }
}