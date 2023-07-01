import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        int a = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                cnt++;
            }
        }
        int[] answer;
        if(cnt == 0){
            cnt = cnt + 1;
            answer = new int[cnt];
            answer[0] = -1;
        }else{
            answer = new int[cnt];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] % divisor == 0){
                    answer[a] = arr[i];
                    a++;
                }
            }
            Arrays.sort(answer);
        }
        
        return answer;
    }
}