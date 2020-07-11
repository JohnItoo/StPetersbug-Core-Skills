package helpers;

public class Knapsack {
   static int[] dp = new int[100];
   static int[][] dpw = new int[100][100];
    public static void main(String[] args) {
        int W = 12;
        int[] weights = {};
        int[] values = {};

        for(int u = 1; u <= W; u++) {
            for(int i = 0; i < weights.length; i++) {
                if(u >= weights[i]) {
                    dp[u] = (Math.max(dp[u], dp[u-weights[i]])) + values[i];
                }
            }
        }
    }

    public static void withoutRepition() {
        int W = 12;
        int[] weights = {};
        int[] values = {};
        for(int u = 1; u <= W; u++) {
            for(int i = 1; i < weights.length; i++) {
               if(u >= weights[i-1]) {
                   dpw[u][i] = Math.max((dpw[u-weights[i-1]][i-1]) + values[i-1], dpw[u][i-1]);
               }
            }
        }
    //    System.out.println(dpw[w][len]);

        for(int u = W; u >=1; u++) {
            
        }
    }
}
