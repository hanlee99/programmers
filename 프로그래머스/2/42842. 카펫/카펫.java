class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int garo=0;
        int sero=0;
        
        for(int i=1; i<=yellow; i++){
            if(yellow%i == 0){
                garo = Math.max(i, yellow/i);
                sero = Math.min(i, yellow/i);
                int comp = garo*2 + sero*2 + 4;
                if(comp == brown) {
                    garo+=2;
                    sero+=2;
                    break;
                }
            }
        }
        answer[0] = garo;
        answer[1] = sero;
        return answer;
    }
}