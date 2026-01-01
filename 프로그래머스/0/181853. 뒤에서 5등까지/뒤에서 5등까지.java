import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int temp=0;
        answer = new int[5];
        for(int i=0; i<num_list.length; i++){
            for(int j = num_list.length-1; j > i; j--){
                temp = num_list[i];
                if(temp > num_list[j]){
                    num_list[i] = num_list[j];
                    num_list[j] = temp;
                }
            }
        }
        answer = Arrays.copyOfRange(num_list, 0, 5);
        return answer;
    }
}