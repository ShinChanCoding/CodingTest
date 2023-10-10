import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        // 귤의 크기별로 개수를 카운트
        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }

        List<Integer> counts = new ArrayList<>(countMap.values());
        Collections.sort(counts, Collections.reverseOrder());

        int total = 0;
        for (int i = 0; i < counts.size(); i++) {
            if (total >= k) {
                break;
            }
            total += counts.get(i);
            answer++;
        }

        return answer;
    }
}