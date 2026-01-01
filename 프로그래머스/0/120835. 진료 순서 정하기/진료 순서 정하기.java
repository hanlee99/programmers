class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        int[] n = new int[emergency.length];
        int[] idx =new int[emergency.length];
        for(int i=0; i<emergency.length; i++) {
            n[i] = emergency[i];
            idx[i] = i;
        }
        
        for(int i=0; i<emergency.length-1; i++){
            for(int j=emergency.length-1; j>i; j--){
                if(n[i] < n[j]){
                    int temp=n[i];
                    n[i] = n[j];    n[j] = temp;
                    temp = idx[i];
                    idx[i] = idx[j];    idx[j]=temp;
                }
            }
        }
        answer = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++){
            answer[idx[i]] = i+1;
        }
        return answer;
    }
}