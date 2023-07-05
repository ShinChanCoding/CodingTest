class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int big = 0;
        int small = 0;
        if(n>m){
            big = gcd(n,m);
        }else{
            big = gcd(m,n);
        }
        small = m*n/big;
        answer[0] = big;
        answer[1] = small;
        
        return answer;
    }
    public int gcd(int a, int b){
        int c = 0;
        while(b > 0){
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}