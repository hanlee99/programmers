class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] sb = binomial.split(" ");
        int a = Integer.parseInt(sb[0]);
        int b = Integer.parseInt(sb[2]);
        switch(sb[1]){
            case "+": answer = a + b;   break;
            case "-": answer = a - b;   break;
            case "*": answer = a * b;   break;
            default: answer = 0;
        }
        return answer;
    }
}