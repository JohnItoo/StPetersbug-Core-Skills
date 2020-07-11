package chapter5;

import java.io.PrintWriter;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] dp = new int[n];

        for(int i = 0; i < n; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(a[j] < a[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        for(int i  = 0; i< n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        out.println(ans);
        in.close();
        out.close();
    }
}
