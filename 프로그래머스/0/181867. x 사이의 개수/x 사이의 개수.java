class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] st;
        int last = 0;
        st = myString.split("x");
       
        if(myString.charAt(myString.length()-1) == 'x'){
            last++;
        }
        answer = new int[st.length+last];
        if(last != 0) answer[answer.length-1] = 0;
        for(int i=0; i<st.length; i++)
            answer[i] = st[i].length();
        return answer;
    }
}