import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int min=0;
        
        int[] x_arr1 = new int[10];
        for(int i=0; i<X.length(); i++){
            int n = X.charAt(i) - '0';
            x_arr1[n]++;
        }
        int[] y_arr2 = new int[10];
        for(int i=0; i<Y.length(); i++){
            int n= Y.charAt(i) - '0';
            y_arr2[n]++;
        }
        for(int i=9; i>=0; i--){
            min = Math.min(x_arr1[i], y_arr2[i]);
            if(min > 0) 
                sb.append(String.valueOf(i).repeat(min));
        }
        
        if(sb.length() == 0){
            answer = "-1";
        }else if(sb.length() == min){
            answer = "0";
        }else{
            answer = sb.toString();
        }
        return answer;
    }
}