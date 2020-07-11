package helpers;

public class KnapsackRep {
   static int[] dp = new int[100];
    public static void main(String[] args) {
        int W = 12;
        int[] weights = {};
        int[] values = {};

        for(int u = 1; u < W; u++) {
            for(int i = 0; i < weights.length; i++) {
                if(u >= weights[i]) {
                    dp[u] = (Math.max(dp[u], dp[u-weights[i]])) + values[i];
                }
            }
        }
    }
}
