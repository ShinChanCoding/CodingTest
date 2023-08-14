import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int big = numbers.length;
        Arrays.sort(numbers);
        answer = numbers[big-1] * numbers[big-2];
        return answer;
    }
}