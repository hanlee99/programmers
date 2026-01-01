class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i=(len-1)-4; i>=0; i--)
            sb.append('*');
        for(int i=(len-1)-3; i<len;i++)
            sb.append(phone_number.charAt(i));
        answer = sb.toString();
            
        return answer;
    }
}