class Solution {
    static int answer = 0;
    static boolean[] visit;
    public int solution(String begin, String target, String[] words) {
        int cnt = 0;
        visit = new boolean[words.length];
        dfs(begin, target, words, cnt);
        return answer;
    }
    public void dfs(String change, String target, String[] words, int cnt){
        if(change.equals(target)){
            answer = cnt;
            return;
        }
        for(int i = 0; i < words.length; i++){
            if(visit[i]){
                continue;    
            }
            int k = 0;
            for(int j = 0; j < words[i].length(); j++){
                if(change.charAt(j) != words[i].charAt(j)){
                    k++;
                }
            }
            if(k == 1){
                visit[i] = true;
                dfs(words[i], target, words, cnt+1);
                visit[i] = false;
            }
        }
    }
}