import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int[] a1 = 
            Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1]+1);
        int[] b1 = 
            Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1]+1);
        answer = new int[a1.length + b1.length ];
        System.arraycopy(a1, 0, answer, 0, a1.length);
        System.arraycopy(b1, 0, answer, a1.length, b1.length );

        return answer;
    }
}