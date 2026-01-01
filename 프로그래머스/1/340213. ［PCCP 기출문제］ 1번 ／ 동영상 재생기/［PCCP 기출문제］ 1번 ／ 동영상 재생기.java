class Solution {
    public String solution(String video_len, String pos, 
                String op_start, String op_end, String[] commands) {
        String answer = "";
        int vl = timeToN(video_len);
        int p = timeToN(pos);
        int os = timeToN(op_start);
        int oe = timeToN(op_end);
        int cp = p;
        
        for(int i=0; i<commands.length; i++){
            if(p>=os && p<oe) p = oe;
            String co = commands[i];
            if(co.equals("next")){
                p = (p+10)>vl ? vl : p+10;
            }else if(co.equals("prev")){
                p = (p-10) < 0 ? 0 : p-10;
            }
        }
        if(p>=os && p<oe) p = oe;
        int mm = p/60;
        int ss = p%60;
        answer = String.format("%02d:%02d", mm, ss);
        return answer;
    }
    int timeToN(String time){
        String[] st = time.split(":");
        int n = Integer.parseInt(st[0])*60 + Integer.parseInt(st[1]);
        return n;
    }
}