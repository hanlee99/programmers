class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        StringBuilder sb = new StringBuilder(my_str);
        
        for(int i=n; i<sb.toString().length(); i+=n){
            sb.insert(i, ",");
            i++;
        }
        answer = sb.toString().split(",");
        return answer;
    }
}