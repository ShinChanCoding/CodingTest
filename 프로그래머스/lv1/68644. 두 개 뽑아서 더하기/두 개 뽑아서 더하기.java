import java.util.*;
class Solution {
    public Set solution(int[] numbers) {
        Set<Integer> result = new TreeSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                int num = numbers[i] + numbers[j];
                if(result.contains(num) != true){
                    result.add(num);
                }
            }
        }
        System.out.println(result);
        
        
        return result;
    }
}