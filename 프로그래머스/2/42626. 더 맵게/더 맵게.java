import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> prior = new PriorityQueue();
        
        for(int i =0; i< scoville.length; i++)
      	    prior.offer(scoville[i]);
        
        
        while(prior.peek() < K) {
            if(prior.size() < 2) {
      		    answer = -1;
      		    break;
       	    }
       	    int one = prior.poll();
       	    int twe = prior.poll();
       	    int scoville_num = one + twe * 2;
       	    prior.offer(scoville_num);
       	    answer++;
        }
        
        return answer;
    }
}