class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        answer = new String(my_string);
        for(int i=0; i<queries.length; i++){
            answer = answer.substring(0, queries[i][0]) +
                    new StringBuilder(answer.substring(queries[i][0], 
                    queries[i][1]+1)).reverse().toString() +
                    answer.substring(queries[i][1]+1);
        }
        return answer;
    }
}