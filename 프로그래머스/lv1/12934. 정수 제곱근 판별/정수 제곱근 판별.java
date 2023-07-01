class Solution {
    public long solution(long n) {
        long answer = 0;
        long sq = (long)Math.sqrt(n);
        if(sq < Math.sqrt(n)){
            answer = -1;
        } else{
            answer = (sq+1) * (sq + 1);
        }
        return answer;
    }
}