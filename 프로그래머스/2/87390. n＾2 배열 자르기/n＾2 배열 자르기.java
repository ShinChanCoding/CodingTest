import java.util.*;
class Solution {
    public List<Long> solution(int n, long left, long right) {
        List<Long> answer = new ArrayList<>();
        for(long i = left; i <= right; i++){
            long a = i % n;
            long b = i / n;
            long result = Math.max(a,b) + 1;
            answer.add(result);
        }
        return answer;
    }
}