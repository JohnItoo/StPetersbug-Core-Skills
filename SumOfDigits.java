import java.io.PrintWriter;
import java.util.Scanner;

public class SumOfDigits {
    static int[] arr = {1,2,3,4,5,6,7,8,9,0};
    static int[][] dp = new int[10005][10005];

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int s = in.nextInt();
        int l = in.nextInt();

        for(int i = 0; i < 9; i++) {
            dp[i][1] = 1;
        }
        for(int i = 1; i <= s; i ++) {
            for(int el = 1; el <= l; el++) {
                for(int j = 0; j < arr.length-1; j++) {
                    if(i <= arr[j]) continue;
                    dp[i][el] += dp[i-arr[j]][el-1];
                }
            }
        }
        out.println(dp[s][l]);
        in.close();
        out.close();
    }
    static int ans = 0;

    static void backTrack(int s, int l, int cons) {
        System.out.println(s + " " + l);
        if(l == 0) {
            if(s == 0) {
                ans++;
            }
            return;
        }
            for(int i = 0; i < arr.length-1; i++) {
                if(s >= arr[i]) {
                    backTrack(s-arr[i], l - 1, cons);
                }
            }
    }
}
