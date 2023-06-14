class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int gcd = 0;
        int a = arr[0];
        if(arr.length == 1){
            answer = arr[0];
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i]*a; j > 0; j--){
                if(j % a == 0 && j % arr[i] == 0){
                    gcd = j;
                }
            }
            a = gcd;
        }
        answer = gcd;
        return answer;
    }
}