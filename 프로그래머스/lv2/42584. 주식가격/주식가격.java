import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int duration = 0;
            for (int j = i + 1; j < prices.length; j++) {
                duration++;
                if (price > prices[j]) {
                    break;
                }
            }
            answer[i] = duration;
        }
        return answer;
    }
}