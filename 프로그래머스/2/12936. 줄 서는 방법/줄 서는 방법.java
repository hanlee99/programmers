import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) list.add(i);
        int count=0;
        for(int i=n; i>=1; i--){
            long kMinusOneFac = fac(i-1);
            int index = (int)((k-1)/kMinusOneFac);
            int value = list.get(index);
            answer[count++] = value;
            list.remove(index);
            k=(k-1)%kMinusOneFac+1;
        }
        return answer;
    }
    
    private long fac(int n){
        long sum=1L;
        if(n==1||n==0) return sum;
        for(int i=1; i<=n; i++) sum*=i;
        return sum;
    }
}