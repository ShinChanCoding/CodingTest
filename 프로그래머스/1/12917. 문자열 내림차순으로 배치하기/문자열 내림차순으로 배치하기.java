import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] newS = s.toCharArray();
        Arrays.sort(newS);
        answer = new StringBuilder(new String(newS)).reverse().toString();
        return answer;
    }
}