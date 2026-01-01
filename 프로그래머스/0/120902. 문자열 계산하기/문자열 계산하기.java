class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] st = {};
        st = my_string.split(" ");
        answer = Integer.parseInt(st[0]);
        for(int i=2; i<st.length; i+=2){
            int a = Integer.parseInt(st[i]);
        
            answer += st[i-1].equals("+") ? a : a*(-1);
        }   
        return answer;
    }
}