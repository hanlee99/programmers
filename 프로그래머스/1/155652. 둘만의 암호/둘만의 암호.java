class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] st = new int[26];
        for(int i=0; i<skip.length(); i++){
            st[skip.charAt(i)-'a'] = 1;
        }
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int count=0;
            int j;
            int move=0; int next=c-'a';
            while(move<index){
                next = (next+1) %26;
                if(st[next] == 0) move++; 
            }
            sb.append((char)('a' + next));
        }
        answer = sb.toString();
        return answer;
    }
    
}