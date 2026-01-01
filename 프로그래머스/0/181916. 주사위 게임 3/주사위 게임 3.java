class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = a;
        int[] box = {a,b,c,d};
       
        if(a==b && a==c && a==d && b==c && b==d && c==d) 
            answer = 1111*a;
        else if(a==b && a==c && b==c)  answer = (10*a+d)*(10*a+d);
        else if(a==c && a==d && c==d)  answer = (10*a+b)*(10*a+b);
        else if(a==b && a==d && b==d)  answer = (10*a+c)*(10*a+c);
        else if(b==c && b==d && c==d)  answer = (10*b+a)*(10*b+a);
        else if(a==b && c==d)   answer = (a+c)*(a-c);
        else if(a==c && b==d)   answer = (a+b)*(a-b);
        else if(a==d && b==c)   answer = (a+c)*(a-c);
        else if(a==b)   answer = c*d;
        else if(a==c)   answer = b*d;
        else if(a==d)   answer = b*c;
        else if(b==c)   answer = a*d;
        else if(b==d)   answer = a*c;
        else if(c==d)   answer = a*b;
        else if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
            answer = a;
            for(int i=1; i<4; i++) if(answer>box[i]) answer = box[i];
        }
        if(answer < 0) answer*=(-1);
        return answer;
    }
}