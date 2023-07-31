import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> kakao = new Stack<>();
        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                int move = moves[i] - 1;
                if(board[j][move] != 0){
                    int back = 0;
                    if(kakao.size() != 0){
                        back = kakao.pop();   
                    }
                    if(board[j][move] != back){
                        kakao.push(back);
                        kakao.push(board[j][move]);
                        board[j][move] = 0;
                        break;
                    }else{
                        board[j][move] = 0;
                        answer += 2;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}