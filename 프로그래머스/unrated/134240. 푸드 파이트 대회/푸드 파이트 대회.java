import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            int len = food[i] / 2;
            for(int j = 0; j < len; j++){
                answer += Integer.toString(i); 
            }
        }
        answer += "0";
        for(int a = food.length-1; a > 0; a--){
            int len = food[a] / 2;
            for(int b = 0; b < len; b++){
                answer += Integer.toString(a);
            }
        }
        return answer;
    }
}