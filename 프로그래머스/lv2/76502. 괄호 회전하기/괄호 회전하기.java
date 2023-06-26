import java.util.Stack;

public class Solution {
    static public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isValid(s.substring(i) + s.substring(0, i))) {
                answer++;
            }
        }

        return answer;
    }

    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}