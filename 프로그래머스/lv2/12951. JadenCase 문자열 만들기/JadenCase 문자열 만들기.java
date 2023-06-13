import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] answer1 = s.split(" ");
        for(int i = 0; i < answer1.length; i++){
            if(answer1[i].length() == 0){
                answer += " ";
            }else{
                answer1[i] = answer1[i].toLowerCase();
                answer1[i] = answer1[i].substring(0,1).toUpperCase() + answer1[i].substring(1);
                answer += answer1[i] + " ";
            }
        }
        if(s.substring(s.length() -1, s.length()).equals(" ")) return answer;

        return answer.trim();
    }
}