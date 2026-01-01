class Solution {
    public int solution(int n) {
        int answer = 1;
        int i=1;
        while(i*(answer+1)<=n){
            answer++;
            i*=answer;
            
        }
        return answer;
    }
}