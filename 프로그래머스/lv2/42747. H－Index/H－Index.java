import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int len = 0;
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++){
            len = citations.length - i;
            if(citations[i] >= len){
                answer = len;
                break;
            }
        }
        return answer;
        
    }
}