class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int small = 0;
        int big = 0;
        if(a > b){
            small = b;
            big = a;
        }else{
            small = a;
            big = b;
        }
        for(int i = small; i <= big; i++ ){
            answer += i;
        }
        return answer;
    }
}