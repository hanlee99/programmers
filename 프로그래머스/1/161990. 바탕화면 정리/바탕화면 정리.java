class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        answer = new int[4];
        int x1=wallpaper.length;    int y1=wallpaper[0].length();
        int x2=0;   int y2=0;
        int count = 0;
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    x1 = Math.min(x1, i);
                    y1 = Math.min(y1, j);
                    x2 = Math.max(x2, i+1);
                    y2 = Math.max(y2, j+1);
                    count++;
                }
            }
        }
        answer[0] = x1;
        answer[1] = y1;
        answer[2] = x2;
        answer[3] = y2;
        return answer;
    }
}