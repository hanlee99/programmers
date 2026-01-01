class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb = new StringBuilder(s);
        
        while(sb.length() != 1){
            int oneCount = 0;
            for(int i=0; i<sb.length(); i++){
                if(sb.charAt(i) == '0'){
                    answer[1]++;
                }else{
                    oneCount++;
                }
            }
            sb = new StringBuilder(toBinary(oneCount));
            answer[0]++;
        }
        return answer;
    }
    
    private String toBinary(int s){
        StringBuilder sb = new StringBuilder();
        while(s != 0){
            sb.append(s%2);
            s = s/2;
        }
        return sb.reverse().toString();
    }
}