import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int len = A.length;
        for(int i = A.length-1; i >= 0; i--){
            for(int j = len-1; j>=0; j--){
                if(B[j] > A[i]){
                    answer++;
                    len = j;
                    break;
                }
            }
        }
        return answer;
    }
}