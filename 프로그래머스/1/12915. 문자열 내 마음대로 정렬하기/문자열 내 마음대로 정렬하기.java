import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            int cmp = Character.compare(c1, c2);
            if(cmp == 0) return s1.compareTo(s2);
            return cmp;
        });
        return strings;
    }
}