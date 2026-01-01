class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int first=0;
        int last=0;
        for(int i=0; i<section.length; i++){
            int paintArea = section[i];
            if(paintArea > last) {
                last = paintArea + m -1;
                answer++;   
            }
        }
        return answer;
    }
}