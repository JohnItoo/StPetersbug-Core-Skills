import java.io.PrintWriter;
import java.util.Scanner;

public class MakeItSorted {

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] a = new int[n];
        long[] dp = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for(int i = 1; i < n; i++) {
            dp[i] = dp[i-1];
            if(a[i] < a[i-1]) {
                dp[i] += (a[i-1] - a[i]);
            }
        }
        out.println(dp[n-1]);
        in.close();
        out.close();
    }
}
