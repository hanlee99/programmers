class Solution {
    public String solution(String a, String b) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(a.length(), b.length());
        a = "0".repeat(maxLen - a.length()) + a;
        b = "0".repeat(maxLen - b.length()) + b;
        long carry = 0;
        
        for(int i=maxLen; i>0; i-=8){
            int start = Math.max(0, i-8);
            int end = i;
            
            long sum =
                Long.parseLong(a.substring(start, i)) + 
                Long.parseLong(b.substring(start, i)) + 
                carry;
        if(start > 0){
            sb.insert(0, 
                String.format("%08d", sum%100_000_000));
        }else{
            sb.insert(0, sum);
        }
            carry = sum / 100_000_000;
        }
        
        answer = sb.toString().
            replaceFirst("^0+(?!$)", "");
        if(answer.equals("")) answer = "0";

        return answer;
    }
}