import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> sameChar = new Stack<>();
        
        for(char a : s.toCharArray()){
            if(sameChar.isEmpty() == false && sameChar.peek() == a){
                sameChar.pop();
            }else{
                sameChar.push(a);
            }
        }
        if(sameChar.isEmpty() == true){
            answer = 1;
        }
        return answer;
    }
}