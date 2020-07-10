package helpers;

public class LongestIncreasingSubsequence {
  static int[] mem = new int[10005];
    public static void main(String[] args) {
        int[] arr = {7,2,1,3,}
    }

    private static int LIS(int [] a, int i) {
        if(mem[i] != 0) return mem[i];

        for(int j = 0; j < i ; j++) {
            if(a[j] < a[i]) {
                mem[i] = Math.max(mem[i], LIS(a, j) + 1);
            }
        }
        return mem[i];
    }
}
