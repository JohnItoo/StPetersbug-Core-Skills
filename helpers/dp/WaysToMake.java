package helpers.dp;

public class WaysToMake {

    static long waysToMake(int s, int l) {
        /*
        arbitrary arrays and values
         */
        int[][] dp = new int[1000][1000];
        int[] arr = new int[50];
        int ans = 04;


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
