class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left=0; int right=0;
        int len=sequence.length+1;
        int sum=sequence[0];
        
        for(int i=0; i<sequence.length*2; i++){
            if(sum==k){
                if(right-left+1<len){
                    answer[0]=left;
                    answer[1]=right;
                    len=right-left+1;
                }
                right++;
                if(right==sequence.length) break;
                sum+=sequence[right];
            }else if(sum<k){
                right++;
                if(right==sequence.length) break;
                sum+=sequence[right];
            }else{
                sum-=sequence[left++];
            }
        }
        
        return answer;
    }
}