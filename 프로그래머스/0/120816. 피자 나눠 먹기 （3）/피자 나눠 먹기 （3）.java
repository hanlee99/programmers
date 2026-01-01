class Solution {
    public int solution(int slice, int n) {
        int answer = slice;
        int i=0;
        while((i)*slice < n){
            i++;
        }
        answer = i;
        return answer;
    }
}