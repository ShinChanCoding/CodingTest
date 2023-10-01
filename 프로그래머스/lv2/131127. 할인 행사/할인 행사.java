import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        String[] count = new String[10];
        for(int i = 0; i < discount.length; i++){
            if(i + 10 > discount.length){
                break;
            }
            for(int j = 0; j < 10; j++){
                count[j] = discount[j+i];
            }
            int collect = 0;
            for(int k = 0; k < want.length; k++){
                int cnt = Collections.frequency(Arrays.asList(count),want[k]);
                if(cnt == number[k]){
                    collect++;
                }else{
                    break;
                }
            }
            if(collect == want.length){
                answer++;
            }
        }
        return answer;
    }
}