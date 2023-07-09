import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                idx = -1;
            }
            if(idx % 2 == 0){
                answer += Character.toUpperCase(s.charAt(i));
                idx++;
            }else{
                answer += Character.toLowerCase(s.charAt(i));
                idx++;
            }
            
        }
        return answer;
    }
}