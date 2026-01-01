import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        answer = switch(n){
                case 1 -> Arrays.copyOfRange(num_list, 0, slicer[1]+1);
                case 2 -> Arrays.copyOfRange(num_list, slicer[0],    
                                            num_list.length);
                case 3 -> Arrays.copyOfRange(num_list, slicer[0],
                                           slicer[1]+1);
                case 4 -> {
                    int index=0;
                    int[] temp = 
                        new int[(slicer[1]-slicer[0])/slicer[2]+1];
                    for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2])
                        temp[index++] = num_list[i];
                    yield temp;
                    }
                default -> new int[0];
        };
        return answer;
    }
}