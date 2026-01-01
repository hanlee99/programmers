import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Set<Character> skills = new HashSet<>();
        for(char sk : skill.toCharArray()){
            skills.add(sk);
        }
        
        for(int i=0; i<skill_trees.length; i++){
            int curr=0;
            boolean flag = true;
            for(char sk : skill_trees[i].toCharArray()){
                if(skills.contains(sk)){
                    if(sk == skill.charAt(curr)){
                        curr++;
                    }else{
                        flag = false;
                        break;
                    }  
                }
            }
            if(flag) answer++;
        }
        return answer;
    }
}