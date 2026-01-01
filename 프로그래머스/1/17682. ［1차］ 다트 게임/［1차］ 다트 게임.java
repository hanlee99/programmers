class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int before=0;
        int cur_score = 0;
        int count = 0;
        int temp = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            
            if(c >= '0' && c <= '9'){
                temp = temp*10 + (c-'0');
                if(dartResult.charAt(i+1) >= '0' 
                   && dartResult.charAt(i+1) <= '9'){
                    
                }else{
                    answer += before;
                    before = cur_score;
                    cur_score = temp; 
                    temp=0;
                }
            }else if(c == 'S'){
                cur_score = cur_score;
            }else if(c == 'D'){
                cur_score = cur_score*cur_score;
            }else if(c == 'T'){
                cur_score = cur_score*cur_score*cur_score;
            }else if(c == '*'){
                before*=2;
                cur_score*=2;
            }else if(c == '#'){
                cur_score *= -1;
            }
        }
        answer = answer + before + cur_score;
        return answer;
    }
}