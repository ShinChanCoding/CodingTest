import java.util.*;
class Solution {
    private int answer = 0;
    public int solution(String t, String p) {
        for(int i = 0; i < t.length(); i++){
            if(i + p.length() == t.length()){
                addBigger(i, p, t);
                break;
            }
            addBigger(i, p, t);
        }
        return answer;
    }
    public void addBigger(int i, String p, String t){
        String k = t.substring(i, i + p.length());
        Long num1 = Long.parseLong(k);
        Long num2 = Long.parseLong(p);
        if(num1 <= num2){
            answer++;
        }
    }
}
