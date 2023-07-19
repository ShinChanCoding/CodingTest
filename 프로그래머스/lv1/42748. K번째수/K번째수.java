import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int len = commands[i][1] - commands[i][0] + 1;
            int[] result = new int[len];
            int a = 0;
            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                result[a] = array[j];
                a++;
            }
            Arrays.sort(result);
            answer[i] = result[commands[i][2]-1];
        }
        
        return answer;
    }
}