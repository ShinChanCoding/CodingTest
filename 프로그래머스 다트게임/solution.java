import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        List<Integer> point = new ArrayList<Integer>();
        int cnt = 0;
        for(int i=0; i < dartResult.length(); i++){
            if(dartResult.charAt(i) != '*' && dartResult.charAt(i) != '#'){
                int result = compare(dartResult.charAt(i), dartResult.charAt(i+1));
                point.add(result);
                cnt++;
            }else{
                if(dartResult.charAt(i) == '*'){
                    if(cnt == 1){
                        point.set(cnt-1, point.get(cnt-1)*2);
                    }else{
                        point.set(cnt-1, point.get(cnt-1)*2);
                        point.set(cnt-2,point.get(cnt-2)*2);
                    }
                }else{
                    point.set(cnt-1, point.get(cnt-1)*(-1));
                }
            }
        }
        for(int i = 0; i < point.size(); i++){
            answer += point.get(i);
        }
        return answer;
    }
    public int compare(char point, char bonus){
        int nice = point-'0'; 
        switch(bonus){
            case 'S':
                break;
            case 'D':
                nice = nice*nice;
                break;
            case 'T':
                nice = nice*nice*nice;
                break;
        }
        return nice;
    }
}
