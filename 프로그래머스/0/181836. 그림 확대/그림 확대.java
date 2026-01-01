class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        StringBuilder sb = new StringBuilder();
        StringBuilder sbs = new StringBuilder();

        for(int i=0; i<picture.length; i++){
            sbs = new StringBuilder();
            for(int s=0; s<picture[i].length(); s++){
                
                for(int j=0; j<k; j++){
                    sbs.append(picture[i].charAt(s));
                }
            }
            sbs.append(" ");
            for(int q=0; q<k; q++) {
                sb.append(sbs.toString());
                
            }
        }
        if(sb.toString().charAt(0) == ' ') sb.delete(0,1);
        if(sb.toString().charAt(sb.toString().length()-1) == ' ') 
            sb.delete(sb.toString().length()-1, 
                      sb.toString().length());
        answer = sb.toString().split(" ");
        return answer;
    }
}