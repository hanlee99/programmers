class Solution {
    public int[] solution(int[] numlist, int n) {
        int o=0;
        int[] answer = {};
        answer = new int[numlist.length];
        for(int i=0; i<numlist.length; i++) answer[i] = numlist[i]-n;
        for(int i=0; i<answer.length-1; i++){
            for(int j=answer.length-1; j>i; j--){
                if(Math.abs(answer[i]) > Math.abs(answer[j])) {
                    int temp = answer[i];
                    answer[i]=answer[j];
                    answer[j] = temp;
                }
            }
        }
        for(int i=0; i<answer.length-1; i+=o){
            o=0;
            
            for(int j=i+1; j<answer.length; j++){
                if(Math.abs(answer[i])==Math.abs(answer[j])) o++;
                else {
                    break;
                }
            }
            for(int j=i; j<=o+i; j++){
                for(int k=o+i; k>j; k--){
                    if(answer[j]<answer[k]){
                        int temp = answer[j];
                        answer[j] = answer[k];
                        answer[k] = temp;
                    }
                }
            }
            o++;
        }
        for(int i=0; i<answer.length; i++) answer[i]+=n;
        return answer;
    }
}