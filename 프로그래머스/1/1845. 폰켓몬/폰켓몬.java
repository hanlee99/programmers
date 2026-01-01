import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int n: nums){
            if(list.get(list.size()-1) != n)
                list.add(n);
        }
        while(answer>list.size()){
            answer--;
        }
        
        return answer;
    }
}