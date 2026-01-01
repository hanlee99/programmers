class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        do{
            int a = age % 10;
            sb.insert(0, (char) ('a' + a) );
            age/=10;
        }while(age > 0);
        answer = sb.toString();
        return answer;
    }
}