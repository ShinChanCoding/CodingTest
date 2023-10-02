class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] result = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!result[i]){
                bfs(computers, i, result);
                answer++;
            }
        }
        return answer;
    }
    boolean[] bfs(int[][] computers, int i, boolean[] result){
        result[i] = true;
        for(int j = 0; j < computers.length; j++){
            if(i != j && computers[i][j] == 1 && result[j] == false){
                bfs(computers, j, result);
            }
        }
        return result;
    }
}