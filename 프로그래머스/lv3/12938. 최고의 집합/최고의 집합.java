import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        if(n > s){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }else{
            int[] answer = new int[n];
            for(int i = 0; i < n; i++){
                answer[i] = s/n;  
            }
            for(int j = 0; j < s%n; j++){
                answer[j] += 1;
            }
            Arrays.sort(answer);
            return answer;
        }
    }
}