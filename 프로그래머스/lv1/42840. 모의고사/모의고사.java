import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int firstCnt = sum(answers, first);
        System.out.println(firstCnt);
        int secondCnt = sum(answers,second);
        System.out.println(secondCnt);
        int thirdCnt = sum(answers,third);
        System.out.println(thirdCnt);
        int max = Math.max(firstCnt, Math.max(secondCnt,thirdCnt));
        List<Integer> bests = new ArrayList<>();
        if(max == firstCnt){
            bests.add(1);
        }
        if(secondCnt == max){
            bests.add(2);    
        }
        if(thirdCnt == max){
            bests.add(3);   
        }
        int[] answer = new int[bests.size()];
        int a = 0;
        for(int i = 0; i < bests.size(); i++){
            answer[a] = bests.get(i);
            a++;
        }
        return answer;
    }
    public int sum(int[] answers, int[] order){
        int cnt = 0;
        for(int i = 0; i < answers.length; i++){
            int len = i % order.length;
            if(order[len] == answers[i]){
                cnt++;
            }
        }
        return cnt;
    }
}