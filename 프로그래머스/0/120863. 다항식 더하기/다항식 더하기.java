class Solution {
    public String solution(String polynomial) {
        String answer = "";
        answer = polynomial.replace("+", "").replace("  ", " ") + " ";
        
        StringBuilder sb = new StringBuilder();
        int x_n = 0;    int n=0;
        for(int i=0; i<answer.length(); i++){
            char c = answer.charAt(i);
            if(c >= '0' && c <= '9' || c == 'x'){
                sb.append(c);
            }
            if(sb.length() > 0 && c == ' '){
                if(sb.charAt(sb.length()-1) == 'x'){
                    if(sb.length() == 1) x_n+=1;
                    else{
                        sb.deleteCharAt(sb.length() - 1);
                        x_n += Integer.parseInt(sb.toString());
                    }
                }else{
                    n+=Integer.parseInt(sb.toString());
                }
                sb.setLength(0);
            }
        }
        String g = x_n == 0 ? "" : Integer.toString(x_n)+"x";
        if(g.equals("1x")) g = "x";
        String h = n == 0 ? "" : Integer.toString(n);
        answer = (x_n!=0) && (n!=0) ? g+ " + " + h : g+h;
        return answer;
    }
}