class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=n+1;
        int base = countOne(n);
        while(answer != base){
            int comp = countOne(i);
            if(comp == base){
                answer=i;
                break;
            }
            i++;
        }
        return answer;
    }
    private int countOne(int n){
        int count=0;
        if(n == 0) return count;
        while(n!=0){
            if(n%2==1) count++;
            n = n/2;
        }
        return count;
    } 
}