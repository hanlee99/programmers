class Solution {
    public long solution(String numbers) {
        long answer = 0;
        int i=0;
        StringBuilder sb = new StringBuilder();
        char c;
        while(i<numbers.length()){
            c = numbers.charAt(i);
            if(c == 'z'){
                i+=4;
                sb.append('0');
            }else if(c == 'o'){
                i+=3;
                sb.append('1');
            }else if(c == 't'){
                if(numbers.charAt(i+1) == 'w'){
                    i+=3;
                    sb.append('2');
                }else if(numbers.charAt(i+1) == 'h'){
                    i+=5;
                    sb.append('3');
                }
            }else if(c == 'f'){
                if(numbers.charAt(i+1) == 'o'){
                    i+=4;
                    sb.append('4');
                }else{
                    i+=4;
                    sb.append('5');
                }
            }else if(c == 's'){
                if(numbers.charAt(i+1) == 'i'){
                    i+=3;
                    sb.append('6');
                }else{
                    i+=5;
                    sb.append('7');
                }
            }else if(c == 'e'){
                i+=5;
                sb.append('8');
            }else if(c == 'n'){
                i+=4;
                sb.append('9');
            }
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}