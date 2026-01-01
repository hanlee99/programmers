class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};   
        String temp = "s";
        answer = new String[my_string.length()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = my_string.substring(i,answer.length);
        }
        for(int i = 0; i < answer.length-1; i++){
            for(int j = answer.length - 1; j > i; j--){
                if(answer[i].compareTo(answer[j]) > 0) {
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
}