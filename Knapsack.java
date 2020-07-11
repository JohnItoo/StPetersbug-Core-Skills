import java.io.PrintWriter;
import java.util.Scanner;

public class Knapsack {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n, W;
        n = in.nextInt();
        W = in.nextInt();
        int[] weights = new int[n+1];
        int[] values = new int[n+1];

        for(int i = 0; i < n; i++) {
           weights[i] = in.nextInt();
           values[i] = in.nextInt();
        }
        int[][] dp = new int[105][105];
        for(int u = 0; u <= W; u++) {
            for(int i = 1; i <=n; i++) {
                dp[u][i] = dp[u][i-1];
                if(u >= weights[i-1]) {
                    dp[u][i] = Math.max(dp[u-weights[i-1]][i-1] + values[i-1], dp[u][i]);
                }
            }
        }
        int curr = W;
        int i = n;
        while(curr > 0 && i > 0) {
            if(dp[curr][i] != dp[curr][i-1]) {
                curr -= weights[i-1];
                out.println(i);
            }
            i -= 1;
        }
        in.close();
        out.close();
    }
}
