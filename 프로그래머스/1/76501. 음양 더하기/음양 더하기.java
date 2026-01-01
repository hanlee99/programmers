class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        answer = 0;
        for(int i=0; i<absolutes.length; i++){
            int n = signs[i] ? absolutes[i] : absolutes[i]*(-1);
            answer += n;
        }
        return answer;
    }
}