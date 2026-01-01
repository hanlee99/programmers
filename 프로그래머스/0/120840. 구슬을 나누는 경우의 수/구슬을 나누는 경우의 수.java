class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        
        int min = (balls-share >= share) ? share : balls-share;
        int max = balls - min;
        long sumN = 1;   
        
        for(int i=1; i<=min; i++){
            sumN *=  (i+max);
            sumN /= i;
        }
        answer = (int)sumN;
        
        return answer;
    }
}