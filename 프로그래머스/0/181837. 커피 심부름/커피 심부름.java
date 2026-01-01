class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int j = 0;
        for(int i=0; i<order.length; i++){
            if(order[i].length() == 8) j=1;
            else if(order[i].charAt(0) == 'a' ||
                   order[i].charAt(order[i].length()-1) == 'o')
                j=1;
            else j=0;
            answer += (j==1) ? 4500 : 5000;
        }
        return answer;
    }
}