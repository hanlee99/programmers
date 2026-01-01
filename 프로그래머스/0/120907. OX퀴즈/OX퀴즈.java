class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        answer = new String[quiz.length];
        String[] st = {};
        int a=0;    int b=0;    int result = 0;
        for(int i=0; i<quiz.length; i++){
            st = quiz[i].split(" ");
            a = Integer.parseInt(st[0].toString());
            b = Integer.parseInt(st[2].toString());
            
            if(st[1].equals("+")) result = a+b;
            else if(st[1].equals("-")) result = a-b;
            answer[i] = (result == Integer.parseInt(st[4])) ?
                "O" : "X";
            
        }
        return answer;
    }
}