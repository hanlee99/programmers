class Solution {
    public int solution(int[] array, int n) {
        int answer = 1000;
        for(int i=0; i<array.length; i++) { array[i] -= n;}
        for(int i=0; i<array.length; i++){
            int a = Math.abs(array[i]);
            int b = Math.abs(answer);
            if(b > a) answer = array[i];
            else if(b == a && answer > array[i]) answer = array[i];
                
        }
        answer += n;
        return answer;
    }
}