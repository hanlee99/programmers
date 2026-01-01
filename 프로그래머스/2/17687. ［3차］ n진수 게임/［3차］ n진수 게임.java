class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        int num=0;
        
        StringBuilder sb = new StringBuilder();
        
        while(sb.length() < t*m){
            int curr=num;
            //System.out.println(toMagicNum(curr, n));
            sb.append(toMagicNum(curr, n));
            num++;
        }
        StringBuilder res = new StringBuilder();
        for(int i=p-1; i<sb.length()&&res.length()<t; i+=m){
            res.append(sb.charAt(i));
        }
        answer = res.toString();
        return answer;
    }
    
    private String toMagicNum(int num, int n){
        StringBuilder sb = new StringBuilder();
        if(num==0) return "0";
        while(num > 0){
            if(num%n > 9){
                sb.append((char)((num%n)-10+'A'));
            }else{
                sb.append(num%n);
            }
            num/=n;
        }
        return sb.reverse().toString();
    }
}