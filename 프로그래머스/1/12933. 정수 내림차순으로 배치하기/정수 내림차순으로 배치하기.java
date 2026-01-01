import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String st = Long.toString(n);
        StringBuilder sb = new StringBuilder();
        int[] num = new int[st.length()];
        for(int i=0; i<st.length(); i++) num[i] = st.charAt(i)-'0';
        Arrays.sort(num);
        for(int i=num.length-1; i>=0; i--) sb.append(num[i]);
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}