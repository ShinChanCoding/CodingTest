import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String another = Integer.toString(n);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i = 0; i < another.length(); i++){
            answer += another.charAt(i) - '0';
        }
        return answer;
    }
}