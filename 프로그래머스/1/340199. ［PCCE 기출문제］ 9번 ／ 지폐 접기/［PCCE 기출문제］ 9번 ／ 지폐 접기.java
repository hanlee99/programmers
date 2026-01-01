class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int row = wallet[0];
        int col = wallet[1];
        int maxb = Math.max(bill[0], bill[1]);
        int minb = Math.min(bill[0], bill[1]);
        while(Math.max(row,col) < maxb ||
             Math.min(row,col) < minb){
            maxb /= 2;
            if(maxb < minb){
                int temp = maxb;
                maxb = minb;
                minb = temp;
            }
            answer++;
        }
        return answer;
    }
}