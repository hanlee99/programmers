class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int len = (num_list.length%n != 0) ? 
            num_list.length/n + 1 : num_list.length/n;
        answer = new int[len];
        for(int i=0; i<answer.length; i++) answer[i] = num_list[n*i]; 
        return answer;
    }
}