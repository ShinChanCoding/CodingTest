import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int bigLength = sides[sides.length-1];
        int restLength = 0;
        for(int i = sides.length-2; i >= 0; i--){
            restLength += sides[i];
        }
        if(bigLength < restLength){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}