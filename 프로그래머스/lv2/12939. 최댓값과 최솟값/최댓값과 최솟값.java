class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitNumber = s.split(" ");
        int big,small;
        small = big = Integer.parseInt(splitNumber[0]);
        for(int i = 0; i < splitNumber.length; i++){
            if(Integer.parseInt(splitNumber[i]) > big ){
                big  = Integer.parseInt(splitNumber[i]);
            }
            if(Integer.parseInt(splitNumber[i]) < small){
                small = Integer.parseInt(splitNumber[i]);
            }
        }
        answer = "" + small + " " + big;
        return answer;
    }
}