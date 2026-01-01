import java.util.Stack;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] st = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            int prev=-1;
            int idx=0;
            String word = babbling[i];
            boolean flag=true;
            while(idx < word.length()){
                boolean found=false;
                for(int j=0; j<st.length; j++){
                    if(idx+st[j].length() <= word.length() && word.startsWith(st[j], idx)){
                        if(prev != j){
                            idx+=st[j].length();
                            found=true;
                            prev=j;
                        }
                        break;
                    }
                }
                if(!found) {
                    flag=false;
                    break;
                }
            }
            if(flag) answer++;
        }
        return answer;
    }
}