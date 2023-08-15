import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int index = (i + j) % n;
                sum += elements[index];
                set.add(sum);
            }
        }
        
        return set.size();
    }
}