class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<rsp.length(); i++){
            int n = rsp.charAt(i) - '0';
            if(n == 2)  sb.append("0");
            else if(n==0)   sb.append("5");
            else if(n==5)   sb.append("2");
        }
        answer = sb.toString();
        return answer;
    }
}