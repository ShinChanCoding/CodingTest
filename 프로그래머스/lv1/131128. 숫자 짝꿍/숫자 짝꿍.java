import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> xCount = new HashMap<>();
        Map<Character, Integer> yCount = new HashMap<>();

        // X와 Y에서 각 숫자의 등장 횟수를 세기
        countDigits(X, xCount);
        countDigits(Y, yCount);

        StringBuilder answerBuilder = new StringBuilder();

        // X와 Y에서 공통으로 등장하는 숫자들을 찾아서 짝꿍으로 만들기
        for (char digit : xCount.keySet()) {
            if (yCount.containsKey(digit)) {
                int minCount = Math.min(xCount.get(digit), yCount.get(digit));
                for (int i = 0; i < minCount; i++) {
                    answerBuilder.append(digit);
                }
            }
        }

        if (answerBuilder.length() == 0) {
            return "-1";
        } else {
            // 결과 문자열을 내림차순으로 정렬하여 가장 큰 정수로 만듦
            char[] digits = answerBuilder.toString().toCharArray();
            Arrays.sort(digits);
            answerBuilder.setLength(0); // 기존 결과 문자열 초기화

            boolean allZeros = true;
            
            for (int i = digits.length - 1; i >= 0; i--) {
                char digit = digits[i];
                
                if (digit != '0') { // 가장 큰 자리부터 시작하므로 '0'이 아닌 수가 나오면 allZeros를 false로 설정
                    allZeros = false;
                }
                
                answerBuilder.append(digit);
            }

            if (allZeros) { // 결과가 모두 '0'인 경우
                return "0";
            } else {
                return answerBuilder.toString();
            }
        }
    }

    private void countDigits(String number, Map<Character, Integer> countMap) {
        for (char ch : number.toCharArray()) {
             countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
         }
    }
}