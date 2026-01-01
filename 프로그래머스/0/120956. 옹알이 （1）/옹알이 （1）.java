class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] st = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            String s = babbling[i];
            
            for(int j=0; j<st.length; j++){
                s = s.replace(st[j], " ");
            }
            s=s.replace(" ", "");
            
            if(s.length() == 0) 
                answer++;
        }
        
        return answer;
    }
}