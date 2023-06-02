class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int beforeScore = 0;
        int nowScore = 0;
        
        for(int i = 0; i < dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i))){
                answer += nowScore;
                beforeScore = nowScore;
                if(Character.isDigit(dartResult.charAt(i+1))){
                    nowScore = Integer.parseInt(dartResult.substring(i, ++i+1));
                    continue;
                }else{
                    nowScore = Character.getNumericValue(dartResult.charAt(i));
                }
            }else{
                switch(dartResult.charAt(i)){
                    case 'D':
                        nowScore = (int) Math.pow(nowScore, 2);
                        break;
                    case 'T':
                        nowScore = (int) Math.pow(nowScore, 3);
                        break;
                    case '*':
                        answer += beforeScore;
                        nowScore *= 2;
                        break;
                    case '#':
                        nowScore *= -1;
                        break;
                }
            }
        }
        
        return answer + nowScore;
    }
}