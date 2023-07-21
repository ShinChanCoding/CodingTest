class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cola = 0;
        
        while (true) {
            if(n < a){
                break;
            }
            cola = n / a * b;
            n = cola + (n % a);
            answer += cola;
        }
        
        return answer;
    }
}