package helpers;

public class LongestIncreasingSubsequence {
  static int[] mem = new int[10005];
  static int[] prev = new int[1005];
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 3, 8, 4, 9, 1, 2, 6, 5, 9, 3, 8, 1};
//        recursive(arr);
        iterative(arr);
    }

    private static void recursive(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            LIS(arr, i);
        }
        int res = 1;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(mem[i] + " ");
            res = Math.max(res, mem[i]);
        }
        System.out.println("The longest Increasing subsequence of the given array is " + res);
    }

    private static int LIS(int [] a, int i) {
        if(mem[i] == 0)  mem[i] = 1;

        for(int j = 0; j < i ; j++) {
            if(a[j] < a[i]) {
                mem[i] = Math.max(mem[i], LIS(a, j) + 1);
            }
        }
        return mem[i];
    }

    private static void iterative(int [] arr) {
        int res = 1;
       for(int i = 0; i <arr.length; i++) {
           mem[i] = 1;
           prev[i] = -1;
           for(int j = 0; j < i; j++) {
               if(arr[j] < arr[i]) {
                   if(mem[j]+1 > mem[i]) {
                       mem[i] = mem[j]+1;
                       prev[i] = j;
                   }
               }
           }
       }
       int idx = 0;
       for(int i = 0; i < arr.length; i++) {
           System.out.print(mem[i] + " ");
           if(mem[i] > res) {
               idx = i;
               res = mem[i];
           }
       }
       System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.print(prev[i] + " ");
        }
       while(prev[idx] != -1) {
           System.out.println(idx + " ");
           idx = prev[idx];
       }
       System.out.println(idx);
        System.out.println("ITR : The longest Increasing subsequence of the given array is " + res);
    }
}
