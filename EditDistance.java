import java.io.PrintWriter;
import java.util.Scanner;

public class EditDistance {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int m = in.nextInt();
        String u = in.nextLine();
        String w = in.nextLine();
        int i = in.nextInt();
        int d = in.nextInt();
        int s = in.nextInt();
       int[][] dp = new int[n+1][m+1];
       for(int a = 1; a <= m; a++) {
           dp[0][a] = a;
       }
       for(int a = 1; a<=n; a++) {
           dp[a][0] = a;
       }
       for(int a = 1; a<=n; a++) {
           for(int b = 1; b <=m; b++) {
               
           }
       }
        in.close();
        out.close();
    }
}
