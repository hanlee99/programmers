class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        s = s.substring(2, s.length()-2);
        String[] st = s.split("\\},\\{");
        answer = new int[st.length];
        for(String set : st){
            String[] nums = set.split(",");
            for(String n : nums){
                answer[nums.length-1]+=Integer.parseInt(n);
            }
        }
        for(int i=answer.length-1; i>0; i--){
            answer[i]-=answer[i-1];
        }
        
        return answer;
    }
}