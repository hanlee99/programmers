class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<array.length; i++){
            sb = new StringBuilder
                (Integer.toString(array[i]));
            for(int j=0; j<sb.length(); j++){
                if(sb.charAt(j) == '7') answer++;
            }
        }
        return answer;
    }
}