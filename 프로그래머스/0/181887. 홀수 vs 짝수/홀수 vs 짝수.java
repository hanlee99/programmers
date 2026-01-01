class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int nanugi2=0;
        int odd=0;
        for(int i=0; i<num_list.length; i++){
            if(i % 2 == 0){
                nanugi2+=num_list[i];
            }else{
                odd+=num_list[i];
            }
        }
        answer = nanugi2 >= odd ? nanugi2 : odd;
        return answer;
    }
}