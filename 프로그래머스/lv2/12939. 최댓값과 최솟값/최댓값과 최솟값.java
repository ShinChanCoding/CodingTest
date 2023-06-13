class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitNumber = s.split(" ");
        int big = Integer.parseInt(splitNumber[0]);
        int small = Integer.parseInt(splitNumber[0]);
        for(int i = 0; i < splitNumber.length; i++){
            if(Integer.parseInt(splitNumber[i]) > big ){
                big  = Integer.parseInt(splitNumber[i]);
            }
        }
        small = big;
        for(int j = 0; j < splitNumber.length; j++){
            if(Integer.parseInt(splitNumber[j]) < small){
                small = Integer.parseInt(splitNumber[j]);
            }
        }
        answer = "" + small + " " + big;
        return answer;
    }
}