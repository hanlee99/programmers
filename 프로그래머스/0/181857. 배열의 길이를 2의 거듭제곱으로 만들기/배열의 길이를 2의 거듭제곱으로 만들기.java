class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int i=1;
        while(i < arr.length) i*=2;
        
        answer = new int[i];
        for(int j=0; j<arr.length; j++) answer[j] = arr[j];
        for(int j=arr.length; j<i; j++) answer[j] = 0;
        return answer;
    }
}