import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> sum = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++ ){
                for(int k = j+1; k < nums.length; k++){
                    sum.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        
        for(int a = 0; a < sum.size(); a++){
            int b = sum.get(a);
            int cnt = 0;
            for(int c = 2; c < b; c++){
                if((b % c) == 0){
                    cnt++;
                }
            }
            if(cnt == 0){
                answer++;
            }
        }
        return answer;
    }
}