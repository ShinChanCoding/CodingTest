import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length / 2;
        int first = 0;
        Set<Integer> newNums = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            newNums.add(nums[i]);
        }
        if(newNums.size() > len){
            answer = len;
        }else{
            answer = newNums.size();
        }
        return answer;
    }
}