import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.min;

public class EditDistance {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n, m;
        n = in.nextInt();
        m = in.nextInt();
        String u, w;
        u = in.next();
        w = in.next();
        int i, d, s;
        i = in.nextInt();
        d = in.nextInt();
        s = in.nextInt();

        int[][] dp = new int[n + 1][m + 1];
        for (int a = 0; a <= n; a++) {
            for (int b = 0; b <= m; b++) {
                dp[a][b] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for (int a = 0; a <= m; a++) {
            dp[0][a] = 1;
        }
        for (int a = 0; a <= n; a++) {
            dp[a][0] = 1;
        }
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= m; b++) {
                int diff = u.charAt(a - 1) == w.charAt(b - 1) ? 0 : s;
//                dp[a][b] = Math.min(
//                        Math.min(dp[a - 1][b] + d, dp[a - 1][b - 1] + diff),
//                        Math.min(dp[a - 1][b] + d, dp[a][b - 1] + i)
//               );
                dp[a][b] = min(
                        min(dp[a - 1][b] + d, dp[a - 1][b - 1] + diff)
                        ,dp[a][b - 1] + i
                );
            }
        }
        out.println(dp[n][m]);
        in.close();
        out.close();
    }
}
