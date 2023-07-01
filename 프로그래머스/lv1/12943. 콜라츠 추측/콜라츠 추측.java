class Solution {
    public int solution(long num) {
        int answer = 0;
        long col = num;
        while(answer != 500){
            if(col % 2 == 0){
                col = col / 2;
            }else{
                col = col*3 + 1;
            }
            if(col == 1){
                answer++;
                break;
            }
            answer++;
        }
        if(answer == 500){
            answer = -1;
        }else if(num == 1){
            answer = 0;
        }
        return answer;
    }
}