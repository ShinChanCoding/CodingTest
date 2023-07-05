class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int total = 0;
        long result = 0;
        for(int i = 1; i <= count; i++){
            result += price * i;
        }
        System.out.println(result);
        if(money <= result){
            answer = result-money;
        }
        return answer;
    }
}