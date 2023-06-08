import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> numberSet = new HashSet<>(Arrays.asList(phone_book));
        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                if (numberSet.contains(number.substring(0, i))) {
                    return false;
                }
            }
        }
        return answer;
        // finish
    }
}