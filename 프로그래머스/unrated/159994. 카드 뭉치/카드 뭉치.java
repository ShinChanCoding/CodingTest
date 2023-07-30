import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i < goal.length; i++){
           if(index1 < cards1.length && cards1[index1].equals(goal[i])){
               index1++;
           }else if(index2 < cards2.length && cards2[index2].equals(goal[i])){
               index2++;
           }else{
               answer = "No";
               return answer;
           }
        }
        return answer = "Yes";
    }
}