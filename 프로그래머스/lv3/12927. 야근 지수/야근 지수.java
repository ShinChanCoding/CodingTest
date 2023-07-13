import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int work : works){
            queue.add(work);
        }
        for(int i = 0; i < n; i++){
            int bigNum = queue.poll();
            if(bigNum == 0){
                return 0;
            }
            queue.add(bigNum-1);
        }
        int len = queue.size();
        for(int j = 0; j < len; j++){
            int result = queue.poll();
            answer += result*result;
        }
        
        return answer;
    }
}