import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            // 스택이 비어있지 않고 현재 원소가 스택의 맨 위 원소보다 크다면
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = numbers[i];
            }
            // 현재 원소를 스택에 추가
            stack.push(i);
        }

        // 스택에 남아있는 인덱스들에 대한 뒷 큰수는 없으므로 -1로 설정
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = -1;
        }

        return answer;
    }
}