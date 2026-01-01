class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx =  (k-1)*2 % (numbers.length);
        answer = numbers[idx];
        return answer;
    }
}