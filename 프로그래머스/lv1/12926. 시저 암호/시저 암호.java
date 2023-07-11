import java.util.*;
class Solution {
    public String solution(String s, int n) {
        char[] result = s.toCharArray();
        for(int j = 0; j < n; j++){
            for(int i = 0; i < result.length; i++){
                if(result[i] == ' '){
                    continue;
                }else if(result[i] == 'Z' || result[i] == 'z'){
                    int a = result[i] - 25;
                    result[i] = (char)a;
                }else{
                    int b = result[i] + 1;
                    result[i] = (char)b;
                }
            }
        }
        String answer = new String(result);
        return answer;
    }
}