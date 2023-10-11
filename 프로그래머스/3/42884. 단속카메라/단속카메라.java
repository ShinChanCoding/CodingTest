import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        int nowValue = -30000;
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1]));
        for(int i = 0; i < routes.length; i++){
            if(routes[i][0] > nowValue){
                nowValue = routes[i][1];
                answer++;
            }
        }
        return answer;
    }
}