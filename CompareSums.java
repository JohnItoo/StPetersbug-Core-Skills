import java.io.PrintWriter;
import java.util.Scanner;

public class CompareSums {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            float curr = in.nextFloat();
            a[i] = a[i - 1] + (int)(curr* 10000);
        }
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            float curr = in.nextFloat();
            b[i] = b[i - 1] + (int)(curr * 10000);
        }
//        out.println(a[n]);
//        out.println(b[n]);
        if (b[n] > a[n]) {
            out.println("SUM(A)<SUM(B)");
        } else if (a[n] > b[n]) {
            out.println("SUM(A)>SUM(B)");
        } else {

            out.println("SUM(A)=SUM(B)");
        }

        in.close();
        out.close();
    }
}