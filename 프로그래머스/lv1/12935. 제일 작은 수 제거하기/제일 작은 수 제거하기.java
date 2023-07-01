class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int cnt = 0;
        if(arr.length-1 == 0){
            int[] answer = {-1};
            return answer;
        }else{
            int[] answer = new int[arr.length-1];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            for(int j = 0; j < arr.length; j++){
                if(arr[j] != min){
                    answer[cnt] = arr[j]; 
                    cnt++;
                }
            }
            return answer;
        }

    }
}