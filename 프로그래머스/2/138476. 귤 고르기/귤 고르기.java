import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        List<Integer> result = new ArrayList<>();
        Arrays.sort(tangerine);
        int value = tangerine[0];
        int cnt = 0;
        for (int i = 0; i < tangerine.length; i++) {
            if (value == tangerine[i]) {
                cnt++;
            } else {
                result.add(cnt);
                value = tangerine[i];
                cnt = 1;
            }
            if (i == tangerine.length - 1) {
                result.add(cnt);
            }
        }

        Collections.sort(result, Collections.reverseOrder());
        int total = 0;
        for (int j = 0; j < result.size(); j++) {
            if (total >= k) {
                break;
            }
            total += result.get(j);
            answer++;
        }
        return answer;
    }
}