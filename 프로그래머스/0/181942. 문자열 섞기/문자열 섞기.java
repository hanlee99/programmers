class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char[] a = str1.toCharArray();
        char[] b=  str2.toCharArray();
        
        char[] c = new char[str1.length()*2];
        for(int i=0; i<str1.length(); i++) c[i*2] = a[i];
        for(int i=0; i<str1.length(); i++) c[i*2+1] = b[i];
        
        answer = new String(c);
        return answer;
    }
}