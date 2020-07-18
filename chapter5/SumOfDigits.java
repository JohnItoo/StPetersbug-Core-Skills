package chapter5;

import java.io.PrintWriter;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int s = in.nextInt();
        int l = in.nextInt();

         long[][] dp = new long[s+1][l+1];


        for(int sum = 0; sum <= Math.min(s, 9); sum++) {
            dp[sum][1] = 1;
        }

        for(int sum = 1; sum <= s; sum++) {
            for(int len = 2; len <= l; len++) {
                 for(int i = 0; i < 10; i++) {
                     if(i>=sum) continue;
                     dp[sum][len] += dp[sum-i][len-1];
                 }
            }
        }

        out.println(dp[s][l]);
        in.close();
        out.close();
    }
}