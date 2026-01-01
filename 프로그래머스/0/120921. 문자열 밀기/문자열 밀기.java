import java.util.ArrayList;
class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        ArrayList<Integer> list = new ArrayList<>();
    
        for(int i=0; i<A.length(); i++){
            if(A.charAt(0) == B.charAt(i)) list.add(i);
        }
        for(int i=0; i<list.size(); i++){
            if(A.equals(B.substring(list.get(i)) 
                        + B.substring(0,list.get(i)))){
                answer = list.get(i);
                break;
            }
        }
        
        return answer;
    }
}