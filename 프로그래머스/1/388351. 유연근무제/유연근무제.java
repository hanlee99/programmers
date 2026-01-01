class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i=0; i<timelogs.length; i++){
            int day = startday;
            boolean flag = true;
            int time = schedules[i];
            int hour = time/100;
            int minute = time%100;
            int plan = (minute+10)%60 + ((minute+10)/60 + hour)*100;
            
            for(int j=0; j<timelogs[i].length; j++){
                if(day > 7) day = 1;
                if(day != 6 && day != 7){
                    if(plan < timelogs[i][j]){
                        flag = false;
                        break;
                    }
                }
                day++;
            }
            if(flag) answer++;
        }
        return answer;
    }
}