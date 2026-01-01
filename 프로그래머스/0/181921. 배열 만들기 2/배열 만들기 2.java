class Solution {
    public int[] solution(int l, int r) {
        int first = 0;  int last = 0;
        int[] not = new int[1]; not[0] = -1;
        String s;   char[] c;
        int index=0;    int[] answer;
        
        if( r < 5 || (l < 5 && r < 5)) return not;
        
        s = Integer.toString(l/5);
        c = s.toCharArray();
    
        if(c[0] > '1') 
            for(int i=0; i<c.length; i++) 
                c[i] = '1';
        else    
            for(int i=0; i<c.length; i++) 
               if(c[i]>'1') c[i]='1';
        s = new String(c);
        first = Integer.parseInt(s, 2);
        if(Integer.parseInt(Integer.toBinaryString(first))*5!=l)
            first++;

        s = new String(Integer.toString(r/5));
        c = s.toCharArray();
        if(c[0] > '1')
            for(int i=0; i<c.length; i++)
                c[i] = '1';
        else 
            for(int i=0; i<c.length; i++)  
                if(c[i]>'1') c[i]='1';
        s = new String(c);
        last = Integer.parseInt(s,2);        
        
        if(first>last || (first == last && 
            Integer.parseInt(Integer.toBinaryString(first))*5 < l) ){
            return not;
        }else 
            answer = new int[last-first+1];
            for(int i=first; i<=last; i++ ){
                answer[index++] = 
                    Integer.parseInt(Integer.toBinaryString(i))*5;
        }
        
        return answer;
    }
}