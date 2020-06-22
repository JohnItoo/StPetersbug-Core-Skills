import java.io.PrintWriter;
import java.util.Scanner;

public class TheCheapestPermutation {
    static int N;
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        N = n;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
                a[i][j] = in.nextInt();

        int[] result = new int[n];

        permute(0,n, result);

        // your code

        for (int i = 0; i < result.length; ++i) {
            if (i != 0) out.print(' ');
            out.print(result[i]);
        }
        out.println();

        in.close();
        out.close();
    }
    static boolean[] done = new boolean[10];
    static int sum = 
    static void permute(int k, int n, int[] result) {
        if(k < n) {
            for(int i = 0; i < n; i++) {
                if(done[i]) continue;
                done[i] = true;
                result[k] = i+1;
                permute(k+1, n, result);
                done[i] = false;
            }
        } else {
            for(int element : result) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}