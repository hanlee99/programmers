class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        for(int i=0; i<2; i++){
            for(int j=2; j>i; j--){
                if(sides[i]>sides[j]){
                    int temp = sides[i];
                    sides[i] = sides[j];
                    sides[j] = temp;
                }
            }
        }
        answer = (sides[2] <sides[0]+sides[1]) ? 1 : 2;
        return answer;
    }
}