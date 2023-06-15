class Solution {
    public int[] solution(int brown, int yellow) {
    int[] answer = new int[2];
    int sum = brown + yellow;

    for (int width = 3; width <= Math.sqrt(sum); width++) {
        if (sum % width == 0) {
            int height = sum / width;
            int borderCount = 2 * (width + height - 2);

            if (borderCount == brown) {
                answer[1] = width;
                answer[0] = height;
                return answer;
            }
        }
    }
    
    return answer;
    }
}