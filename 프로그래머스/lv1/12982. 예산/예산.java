import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int max = 0;
        int result = 0;
        for(int i = 0; i < d.length; i++){
            max += d[i];
            if(max > budget){
                break;
            }
            result++;
        }
        return result;
    }
}