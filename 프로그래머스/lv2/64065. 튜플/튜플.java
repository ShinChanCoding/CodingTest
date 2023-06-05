import java.util.*;

class Solution {
    public int[] solution(String s) {
        String numberSequence = "";
        LinkedList<Integer> queue = new LinkedList<>();
        int numberOfSets = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '}') {
                numberOfSets++;
            }
        }
        int[][] results = new int[numberOfSets][];
        for (int i = 0; i < numberOfSets; i++) {
            results[i] = new int[i + 1];
        }

        for (int i = 1; i < s.length() - 1; i++) {
            char c = s.charAt(i);

            if (c == '{') {
                numberSequence = "";
            } else if (c == ',') {
                if (s.charAt(i - 1) != '}') {
                    int setNumber = Integer.parseInt(numberSequence);
                    queue.add(setNumber);
                }
            } else {
                if (c != '}') { // 숫자일때
                    if (s.charAt(i - 1) != ',') {
                        String changed = Character.toString(c);
                        numberSequence = numberSequence + changed;
                    } else {
                        numberSequence = "";
                        String changed = Character.toString(c);
                        numberSequence = numberSequence + changed;
                    }
                } else { // '}'일때
                    int setNumber = Integer.parseInt(numberSequence);
                    queue.add(setNumber);
                    int queueSize = queue.size();
                    for (int j = 0; j < queueSize; j++) {
                        results[queueSize - 1][j] = queue.poll();
                    }
                }
            }
        }
        int[] answer = new int[numberOfSets];
        int answerLength = 0;
        int check = 0;

        for (int i = 0; i < numberOfSets; i++) {
            if (i == 0) {
                answer[i] = results[0][0];
                answerLength++;
            } else {
                for (int j = 0; j < results[i].length; j++) {
                    check = 0;
                    for (int k = 0; k < answerLength; k++) {
                        if (results[i][j] == answer[k]) {
                            check++;
                            break;
                        }
                    }
                    if (check == 0) {
                        answer[answerLength++] = results[i][j];
                        break;
                    }
                }
            }
        }

        return answer;
    }
}