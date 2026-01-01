import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[][] fail = new int[N+1][3];
        int sum=stages.length;
        for(int i=0; i<stages.length; i++) fail[stages[i]-1][1]++;
        
        for(int i=0; i<N; i++){
            fail[i][0] = i+1;
            sum -= fail[i][1];
            fail[i][2] = sum;
        }
        Arrays.sort(fail, 0, N, 
        Comparator.<int[]>comparingDouble(
            a -> a[1] == 0 ? 0 : (double)a[1]/a[2])
        .reversed()
        .thenComparingInt(a -> a[0]));
        for(int i=0; i<N; i++) answer[i] = fail[i][0];
        return answer;
    }
}