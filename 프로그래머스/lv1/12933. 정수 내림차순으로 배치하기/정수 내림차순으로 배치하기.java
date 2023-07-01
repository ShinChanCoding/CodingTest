import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String b = Long.toString(n);
        String result = "";
        char[] arr = b.toCharArray();
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--){
            result += arr[i];
        }
        answer = Long.parseLong(result);
        return answer;
    }
}