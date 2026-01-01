class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a=1;
        int b=0;
        for(int c : num_list){
            a*=c;
            b+=c;
        }
        answer = (a < b*b) ? 1 : 0;
        return answer;
    }
}