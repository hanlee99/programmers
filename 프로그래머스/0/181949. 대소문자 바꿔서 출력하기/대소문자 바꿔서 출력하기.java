import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        char c;
        for(int i=0; i<a.length(); i++){
            c = a.charAt(i);
            if(c > 96) sb.append((char)(c-32));
            else sb.append((char)(c+32));
        }
        System.out.println(sb);
    }
}