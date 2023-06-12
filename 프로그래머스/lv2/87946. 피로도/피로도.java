import java.util.*;
class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        int n = dungeons.length;
        boolean[] visited = new boolean[n];
        
        // 최대한 많은 던전 탐험을 위해 피로도를 내림차순으로 정렬
        Arrays.sort(dungeons, (a, b) -> b[0] - a[0]);
        
        // 완전 탐색을 위한 재귀 함수
        answer = exploreDungeons(k, dungeons, visited, 0);
        
        return answer;
    }
    
    private int exploreDungeons(int currentFatigue, int[][] dungeons, boolean[] visited, int count) {
        // 던전을 모두 탐험한 경우
        if (count == dungeons.length) {
            return count;
        }
        
        int maxCount = count;
        
        for (int i = 0; i < dungeons.length; i++) {
            // 이미 탐험한 던전인 경우 무시
            if (visited[i]) {
                continue;
            }
            
            int minFatigue = dungeons[i][0];
            int consumedFatigue = dungeons[i][1];
            
            // 피로도가 충분한 경우 던전 탐험 가능
            if (currentFatigue >= minFatigue) {
                visited[i] = true;
                int newCount = exploreDungeons(currentFatigue - consumedFatigue, dungeons, visited, count + 1);
                maxCount = Math.max(maxCount, newCount);
                visited[i] = false;
            }
        }
        
        return maxCount;
    }
}