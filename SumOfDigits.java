import java.io.PrintWriter;
import java.util.Scanner;

public class SumOfDigits {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    static long[][] dp = new long[10005][10005];

    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        int s = in.nextInt();
//        int l = in.nextInt();
        for (int i = 0; i < 9; i++) {
            dp[i][1] = 1L;
        }
        waysToMake(10, 10);

//        for(int i = 1; i <= s; i ++) {
//            for(int el = 1; el <= l; el++) {
//                for(int j = 0; j < arr.length-1; j++) {
//                    if(i <= arr[j]) continue;
//                    dp[i][el] += dp[i-arr[j]][el-1];
//                }
//            }
//        }
        out.println("This is ans " + ans);
        in.close();
        out.close();
    }

    static long ans = 0;

    static long waysToMake(int s, int l) {
        System.out.println(s + " " + l);
        if (dp[s][l] != 0) return dp[s][l];
//        if (l == 1) {
//            if (s <= 9) {
//                return 1;
//            } else return 0;
//        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (s >= arr[i]) {
                System.out.println("picked : " + arr[i]);
                ans += waysToMake(s - arr[i], l - 1);
            }
        }
        dp[s][l] = ans;
        return ans;
    }

}
