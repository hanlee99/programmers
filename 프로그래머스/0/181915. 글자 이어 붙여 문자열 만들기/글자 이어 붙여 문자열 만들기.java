class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] c = new char[index_list.length];
        
        for(int i=0; i < c.length; i++){
            c[i] = my_string.charAt(index_list[i]);
        }
        answer = new String(c);
        return answer;
    }
}