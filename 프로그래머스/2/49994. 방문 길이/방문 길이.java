import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;
        int y = 0;
        int beforeX = 0;
        int beforeY = 0;
        Set<String> result = new HashSet<>();
        for(int i = 0; i < dirs.length(); i++){
            beforeX = x;
            beforeY = y;
            String position = "";
            if(dirs.charAt(i) == 'U' && x < 5){
                x++;
                position += x;
                position += y;
                position += beforeX;
                position += beforeY;
            }else if(dirs.charAt(i) == 'D' && x > -5){
                x--;
                position += beforeX;
                position += beforeY;
                position += x;
                position += y;
            }else if(dirs.charAt(i) == 'L' && y > -5){
                y--;
                position += beforeX;
                position += beforeY;
                position += x;
                position += y;
            }else if(dirs.charAt(i) == 'R' && y < 5){
                y++;
                position += x;
                position += y;
                position += beforeX;
                position += beforeY;
            }else{
                continue;
            }
            result.add(position);
        }
        answer = result.size();
        return answer;
    }
}