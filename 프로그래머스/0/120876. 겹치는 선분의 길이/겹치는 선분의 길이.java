class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int a = 
            Math.max(Math.max(lines[0][1],lines[1][1]),lines[2][1]);
        int b = 
            Math.min(Math.min(lines[0][0],lines[1][0]),lines[2][0]);
        int[] arr = new int[Math.abs(a-b)+1];
        for(int i=0; i<3; i++){
            int start = lines[i][0];
            int end = lines[i][1];
            for(int j=start; j<end; j++)
                    arr[j-b]++;
        }
        for(int i=0; i<arr.length; i++)
            if(arr[i] >= 2) answer++;
        return answer;
    }
}