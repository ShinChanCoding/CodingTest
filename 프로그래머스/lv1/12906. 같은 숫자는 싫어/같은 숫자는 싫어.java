import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> a = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                a.push(arr[i]);
            }else{
                if(a.peek() != arr[i]){
                    a.push(arr[i]);
                }
            }
        }
        int[] answer = new int[a.size()];
        for(int j = a.size()-1; j >= 0; j--){
            answer[j] = a.pop();
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}