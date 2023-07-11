import java.util.*;
class Solution {
    
    public int solution(int[][] sizes) {
        int index = 0;
        int first = 0;
        int second = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int mount = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = mount;
            }
        }
        for(int j = 0; j < sizes.length; j++){
            if(first < sizes[j][0]){
                first = sizes[j][0];
            }
            if(second < sizes[j][1]){
                second = sizes[j][1];
            }
        }
        int answer = first * second;
        return answer;
    }
}