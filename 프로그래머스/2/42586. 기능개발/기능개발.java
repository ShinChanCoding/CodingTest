import java.util.*;
class Solution {
    public List solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> result = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++){
            int rest = 100 - progresses[i];
            int date = rest / speeds[i];
            if(rest % speeds[i] != 0){
                date += 1;
            }
            result.offer(date);
        }
        int first = result.poll();
        System.out.println(first);
        int cnt = 1;
        while(!result.isEmpty()){
            int com = result.poll();
            System.out.println(com);
            if(first < com){
                answer.add(cnt);
                first = com;
                cnt = 1;
            }else{
                System.out.println("더함");
                cnt++;
            }
        }
        answer.add(cnt);
        return answer;
    }
}