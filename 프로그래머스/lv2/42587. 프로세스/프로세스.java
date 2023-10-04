import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        for(int i = 0; i < priorities.length; i++){
            que.add(priorities[i]);
        }
        while(!que.isEmpty()){
           for(int j = 0; j < priorities.length; j++){
               if(que.peek() == priorities[j]){
                   que.remove();
                   answer++;
                   if(j == location){
                        return answer;
                   }
                }
            }
        }
        return answer;
    }
}