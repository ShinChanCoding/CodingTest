import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        List<Character> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(s.charAt(i))) {
                result.add(s.charAt(i));
                answer[i] = -1;
            } else {
                int len = result.lastIndexOf(s.charAt(i));
                answer[i] = result.size() - len;
                result.add(s.charAt(i));
            }
        }
        return answer;
    }
}