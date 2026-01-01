class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            int count = 1;
            int j=2;
            while(j*2 <= i) {
                if(i%j == 0) count++;
                j++;
            }
            if(i!=1) count++;
            answer = (count%2==0) ? answer+i : answer-i;
        }
        return answer;
    }
}