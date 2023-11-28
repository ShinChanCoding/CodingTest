import java.util.*;
class Solution {
    public int solution(String word) {
        int answer = 0;
		
		HashMap<Character, Integer> words = new HashMap<>();
		
		words.put('A', 0);
		words.put('E', 1);
		words.put('I', 2);
		words.put('O', 3);
		words.put('U', 4);
        
        int[] arr = {781, 156, 31, 6, 1};
		
		answer += word.length();
		
		for (int i = 0; i < word.length(); i++) {
			answer += words.get(word.charAt(i)) * arr[i];
		}
		
		return answer;
		
    }
}