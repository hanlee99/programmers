import java.util.HashMap;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        int num = id_list.length;
        answer = new int[num];
        boolean[][] record = new boolean[num][num];
        HashMap<String, Integer> user = new HashMap<>();
        HashMap<String, Integer> hash = new HashMap<>();
        for(int i=0; i<num; i++)    {
            hash.put(id_list[i],0);
            user.put(id_list[i], i);
        }
        
        for(int i=0; i<report.length; i++){
            String[] r = report[i].split(" ");
            String reporter = r[0];
            String reported = r[1];
            if(record[user.get(reporter)][user.get(reported)] 
               == false && !reporter.equals(reported)){
                record[user.get(reporter)][user.get(reported)]=true;
                hash.put(reported, hash.get(reported)+1);
            }
        }
        for(int i=0; i<record.length; i++){
            for(int j=0; j<record[i].length; j++){
                if(record[i][j] == true && hash.get(id_list[j]) >= k)
                    answer[i]++;
            }
        }
        
        return answer;
    }
}