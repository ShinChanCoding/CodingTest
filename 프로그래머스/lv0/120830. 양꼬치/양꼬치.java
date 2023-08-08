class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sheep = n * 12000;
        int potion = k * 2000;
        int free = (n / 10) * 2000;
        answer = sheep + potion - free;
        return answer;
    }
}