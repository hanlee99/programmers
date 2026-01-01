class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        
        /*for(int i=0; i<n; i++){
            arr[i][i] = i+1;
            for(int j=0; j<=i; j++){
                arr[i][j] = i+1;
                arr[j][i] = i+1;
            }
        }*/
        int len = (int)(right-left)+1;
        answer = new int[len];
        int idx=0;
        long m=n;
        for(long i=left; i<=right; i++){
            int r=(int)(i/m);
            int c=(int)(i%m);
            answer[idx] = Math.max(r,c) + 1;
            idx++;
        }
        return answer;
    }
}