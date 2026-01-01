import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("code", 0);    hash.put("date", 1);
        hash.put("maximum", 2); hash.put("remain", 3);
        int sort = hash.get(sort_by);
        int col = hash.get(ext);
        for(int i=0; i<data.length; i++){
            if(data[i][col] < val_ext) list.add(i);
        }
        
        answer = new int[list.size()][data[0].length];
        for(int i=0; i<list.size(); i++) {
            int row = list.get(i);
            System.arraycopy
            (data[row], 0, answer[i], 0, data[row].length);
        }
        Arrays.sort(answer, Comparator.comparingInt(a -> a[sort]));
        return answer;
    }
}