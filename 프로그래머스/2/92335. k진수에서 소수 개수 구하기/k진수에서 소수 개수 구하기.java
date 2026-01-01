class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String MagicNum = toChange(n, k);
        
        String[] nums = MagicNum.split("0+");
        if(nums.length == 0) return 0;
        
        for(String st : nums){
            if(st.length() == 0) continue;
            long num = Long.parseLong(st);
            if(isPrime(num)){
                answer++;
            }
        }
        return answer;
    }
    private String toChange(int n, int k){
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            sb.append(n%k);
            n/=k;
        }
        return sb.reverse().toString();
    }
    private boolean isPrime(long n){
        if(n<2) return false;
        for(long i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}