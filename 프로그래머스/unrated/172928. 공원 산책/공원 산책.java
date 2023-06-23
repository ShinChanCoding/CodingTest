class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        char[][] newPark = new char[park.length][park[0].length()];
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[0].length(); j++){
                newPark[i][j] = park[i].charAt(j);
                if(park[i].charAt(j) == 'S'){
                    x = i;
                    y = j;
                }
            }
        }
        for(int k = 0; k < routes.length; k++){
            char way = routes[k].charAt(0);
            int count = routes[k].charAt(2) - '0';
            boolean success = true;
            switch(way){
                case 'E' :
                    for(int a = 1; a <= count; a++){
                        if(y + a > newPark[0].length - 1 || newPark[x][y+a] == 'X' ){
                            success = false;
                            break;
                        }
                    }
                    if(success == true){
                        x = x;
                        y = y + count;
                    }
                    break;
                case 'W' :
                    for(int b = 1; b <= count; b++){
                        if(y-b < 0 || newPark[x][y-b] == 'X' ){
                            success = false;
                            break;
                        }
                    }
                    if(success == true){
                        x = x;
                        y = y - count;
                    }
                    break;
                case 'S' :
                    for(int c = 1; c <= count; c++){
                        if(x + c > newPark.length - 1 || newPark[x+c][y] == 'X' ){
                            success = false;
                        }
                    }
                    if(success == true){
                        x = x+count;
                        y = y;
                    }
                    break;
                case 'N' :
                    for(int d = 1; d <= count; d++){
                        if(x-d < 0 || newPark[x-d][y] == 'X'){
                            success = false;
                        }
                    }
                    if(success == true){
                        x = x-count;
                        y = y;
                    }
                    break;
                default :
                    break;
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}