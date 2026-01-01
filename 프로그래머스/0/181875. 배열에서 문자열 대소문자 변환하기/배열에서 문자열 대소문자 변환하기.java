class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        answer = new String[strArr.length]; 
        StringBuilder sb;
        for(int j=0; j<strArr.length; j++){
            if(j % 2 == 0) 
                answer[j] = strArr[j].toLowerCase();
            else
                answer[j] = strArr[j].toUpperCase();
        }
        return answer;
    }
}