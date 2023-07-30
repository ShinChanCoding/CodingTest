import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        if(score.length < m){
            return answer;
        }
        for(int i = score.length-1; i >= 0; i -= m){
            int min = k;
            for(int j = i; j > i-m; j--){
                if(score[j] < min){
                    min = score[j];
                }
            }
            answer += min * m;
            if(i - m - m + 1 < 0){
                break;
            }
        }
        return answer;
    }
}