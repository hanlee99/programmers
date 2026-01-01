import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(String word) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        String[] mo = {"A", "E", "I", "O", "U"};
        
        for(int i=0; i<5;i++){
            String a=mo[i];
            list.add(a);
            for(int j=0; j<5; j++){
                String b = a+mo[j];
                list.add(b);
                for(int k=0; k<5; k++){
                    String c = b+mo[k];
                    list.add(c);
                    for(int m=0; m<5; m++){
                        String d = c+mo[m];
                        list.add(d);
                        for(int n=0; n<5; n++){
                            String e = d+mo[n];
                            list.add(e);
                        }
                    }
                }
            }
        }
        Collections.sort(list);
        for(String n : list){
            answer++;
            if(n.equals(word)) break;
        }
        return answer;
    }
}