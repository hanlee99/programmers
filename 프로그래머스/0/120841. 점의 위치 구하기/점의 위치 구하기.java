class Solution {
    public int solution(int[] dot) {
        int answer = 1;
        if(dot[0]>0) answer += (dot[1]>0) ? 0 : 3;
        else answer += (dot[1]>0) ? 1 : 2;
        
        return answer;
    }
}