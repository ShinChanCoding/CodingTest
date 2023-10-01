import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a = in.nextLine();
        int cnt = 0;
        int best = 0;
        String[] b = a.split(" ");
        for(int i = 0; i < b.length; i++){
            if(b[i].length() > best) {
                best = b[i].length();
                cnt = i;
            }
        }
        System.out.println(b[cnt]);
    }
}
