class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length+1];
        int before = num_list[num_list.length-2];
        int last = num_list[num_list.length-1];
        for(int i=0; i<num_list.length; i++) answer[i] = num_list[i];
        answer[answer.length-1] = (last > before) ? 
            last-before : last*2;
        return answer;
    }
}