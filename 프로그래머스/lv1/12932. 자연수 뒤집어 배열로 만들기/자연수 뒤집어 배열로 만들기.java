class Solution {
    public int[] solution(long n) {
        String a = Long.toString(n);
        int[] answer = new int[a.length()];
        int j = 0;
        for(int i = a.length()-1; i >= 0; i--){
            answer[j] = a.charAt(i)-'0';
            j++;
        }
        return answer;
    }
}