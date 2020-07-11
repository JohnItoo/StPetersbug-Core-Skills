package helpers;

public class Knapsack {
   static int[] dp = new int[100];
   static int[][] dpw = new int[100][100];
    public static void main(String[] args) {
//        int W = 12;
//        int[] weights = {};
//        int[] values = {};
//
//        for(int u = 1; u <= W; u++) {
//            for(int i = 0; i < weights.length; i++) {
//                if(u >= weights[i]) {
//                    dp[u] = (Math.max(dp[u], dp[u-weights[i]])) + values[i];
//                }
//            }
//        }
        withoutRepition();
    }

    public static void withoutRepition() {
        int W = 10;
        int[] weights = {6,3,4,2};
        int[] values = {30,14,16,9};
        for(int u = 0; u <= W; u++) {
            dpw[u][0] = 0;
        }
        for(int u = 0; u <= W; u++) {
            for(int i = 1; i <= weights.length; i++) {
                dpw[u][i] = dpw[u][i-1];
                if(u >= weights[i-1]) {
                   dpw[u][i] = Math.max((dpw[u-weights[i-1]][i-1]) + values[i-1], dpw[u][i]);
               }
            }
        }
        System.out.println(dpw[10][4]);

       int u = W;
        int i = weights.length;
        while(u > 0 && i > 0) {
            if(dpw[u][i-1] == dpw[u][i]) {
                i -= 1;
            } else {
                i -= 1;
                u -= weights[i];
            }
        }

    }
}
