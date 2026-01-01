class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[num_list.length];
        for(int i=0 , j = n; i<num_list.length; i++, j++)
            answer[i] = num_list[j%num_list.length];
        return answer;
    }
}