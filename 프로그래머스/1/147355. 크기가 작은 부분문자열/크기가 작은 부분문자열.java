class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int n = p.length();
        long p_num = Long.parseLong(p);
        int i=0;
        
        while(i+n <= t.length()){
            long t_num = Long.parseLong(t.substring(i, i+n));
            if(p_num>=t_num) answer++;
            i++;
        }
        
        return answer;
    }
}