import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main{
    public static void main(String[] arg) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(buffer.readLine());                                         
        int[] T = new int[N+2];
        int[] P = new int[N+2];
        int[] dp = new int[N+2];
                                                 
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(buffer.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = N; i > 0; i--){
            int date = i + T[i];
            if(date <= N+1){
                dp[i] = Math.max(P[i]+dp[date],dp[i+1]);
            }else{
                dp[i] = dp[i+1];
            }
        }
        System.out.print(dp[1]);                                         
    }
}