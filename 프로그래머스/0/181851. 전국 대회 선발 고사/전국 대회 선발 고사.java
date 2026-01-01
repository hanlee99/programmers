class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] num = new int[]{101,101,101};
        int[] idx = new int[3];
        int m = 101;
        int temp = 0;
        for(int i=0; i<rank.length; i++){
            if(attendance[i] == true && num[2] > rank[i]){
                num[2] = rank[i];
                idx[2] = i;
                for(int j=2; j>0; j--) 
                    if(num[j-1] >num[j]){
                        temp = num[j];
                        num[j] = num[j-1];
                        num[j-1] = temp;
                        m = idx[j];
                        idx[j] = idx[j-1];
                        idx[j-1] = m;
                    }
            }
        }
       
        answer = (idx[0])*10000 + 100*(idx[1]) + (idx[2]);
        return answer;
    }
}