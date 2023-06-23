import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int j = 0;
        List<String> word = new ArrayList<>();
        for(int i = 0; i<words.length; i++){
            if(i != 0){
                j++;
                
                char a = words[i-1].charAt(words[i-1].length()-1);
                char b = words[i].charAt(0);
                if(a != b || word.contains(words[i])){
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    break;
                }
            }
            word.add(words[i]);
        }
        return answer;
    }
}
