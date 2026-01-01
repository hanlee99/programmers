import java.util.Set;
import java.util.HashSet;
class Solution {
    private Set<Integer> primes = new HashSet<>();
    private String numbers;
    public int solution(String numbers) {
        int answer = 0;
        this.numbers = numbers;
        boolean[] visited = new boolean[numbers.length()];
        dfs("", 0, visited);
        answer=primes.size();
        return answer;
    }
    private void dfs(String st, int depth, boolean[] visited){
        if(!st.equals("")){
            int num=Integer.parseInt(st);
            if(!primes.contains(num) && isPrime(num)){
                primes.add(num);
            }
        }
        if(depth == numbers.length()){
            return;
        }
        
        for(int i=0; i<numbers.length(); i++){
            if(visited[i]) continue;
            visited[i] = true;
            dfs(st + numbers.charAt(i), depth+1, visited);
            visited[i] = false;
        }
    }
    private boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3; i*i<=n; i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}