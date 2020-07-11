import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChainMatrixMultiplication {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            a[i] = in.nextInt();
        }
        long[][] dp = new long[n + 1][n + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < n; i++) {
            dp[i][i + 1] = 0;
        }
        for (int s = 2; s < n + 1; s++) {
            for (int i = 0; i < n - s + 1; i++) {
                int j = i + s;
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j],
                            dp[i][k] + dp[k][j] + (a[i] * a[j] * a[k]));
                }
            }
        }
        out.println(dp[0][n]);
        in.close();
        out.close();
    }
}
