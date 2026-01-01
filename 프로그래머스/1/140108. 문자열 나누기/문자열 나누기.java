class Solution {
    public int solution(String s) {
        int answer = 0;
        int same=0; 
        int diff=0;
        int f=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(f);
            char d = s.charAt(i);
            if(c == d) same++;
            else diff++;
            
            if(same == diff){
                f=i+1;
                answer++;
                same=0;
                diff=0;
            }
        }
        if(f!=s.length()) answer++;
        
        return answer;
    }
}