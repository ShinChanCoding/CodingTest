class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String changeS = s;
        while(changeS.length() >1){
            int notZero = 0;
            for(int i = 0; i < changeS.length(); i++){
                if(changeS.charAt(i) == '0'){
                    answer[1]++;
                }else{
                    notZero++;
                }
            }
            changeS = Integer.toBinaryString(notZero);
            answer[0]++;
        }
        return answer;
    }
}