import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i < t.length(); i++){
            if(i + p.length() == t.length()){
                String k = t.substring(i, i + p.length());
                Long num1 = Long.parseLong(k);
                Long num2 = Long.parseLong(p);
                if(num1 <= num2){
                    answer++;
                }
                break;
            }
            String k = t.substring(i, i + p.length());
            Long num1 = Long.parseLong(k);
            Long num2 = Long.parseLong(p);
            if(num1 <= num2){
                answer++;
            }
        }
        return answer;
    }
}