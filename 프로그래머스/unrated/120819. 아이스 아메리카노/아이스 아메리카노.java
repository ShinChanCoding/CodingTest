class Solution {
    public int[] solution(int money) {
        int cnt = money / 5500;
        int total = money % 5500;
        int[] answer = {cnt,total};
        return answer;
    }
}