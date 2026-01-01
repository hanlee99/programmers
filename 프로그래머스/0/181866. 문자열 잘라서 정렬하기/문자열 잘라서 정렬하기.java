import java.util.ArrayList;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        String st = "";
        
        answer = myString.split("x");
        for(String str : answer){
            if(!str.isEmpty())
                list.add(str);
        }
        for(int i=0; i<list.size()-1; i++){
            for(int j=list.size()-1; j > i; j--){
                if(list.get(i).compareTo(list.get(j)) > 0){
                    st = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, st);
                }
            }
        }
        answer = list.toArray(new String[0]);
        return answer;
    }
}