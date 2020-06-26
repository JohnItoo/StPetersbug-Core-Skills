import java.io.PrintWriter;
import java.util.Scanner;

public class SumOfMinimums {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            a[i] = x;
        }

        long result = 0L;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                long locmin = 1000001L;
                for (int k = i; k <= j; k++) {
                    locmin = Math.min(locmin, a[k]);
                }
                result += locmin;
            }
        }

        out.println(result);

        in.close();
        out.close();
    }
}