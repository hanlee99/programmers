import java.util.ArrayDeque;
class Solution {
    static int[] nums;
    static int t;
    static int curr=0;
    static int cnt;
    public int solution(int[] numbers, int target) {
        int answer = 0;
        nums = numbers;
        t=target;
        dfs(0);
        answer=cnt;
        return answer;
    }
    private void dfs(int d){
        if(d==nums.length) {
            if(curr==t){
                cnt++;
            }
            return;
        }
        
        curr+=nums[d];
        dfs(d+1);
        curr-=(nums[d])*2;
        dfs(d+1);
        curr+=nums[d]; 
    }
}