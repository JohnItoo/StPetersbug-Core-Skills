import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChainMatrixMultiplication {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
      int n = in.nextInt();
      int[] a = new int[n];
      for(int i = 0; i <n; i++) {
          a[i] = in.nextInt();
      }
      
      int[][] dp = new int[10000][10000];
      for(int s = 2; s < n; s++) {
          for(int i = 0; i <= n-s; i++) {
              int j = i + s;
              for(int k = i+ 1; k < j ; k++) {
                  dp[i][j] = Math.min(dp[i][j],
                          dp[i][k] + dp[k][j] + a[i]*a[j]*a[k]);
              }
          }
      }
      out.println(dp[0][n]);
        in.close();
        out.close();
    }
}
