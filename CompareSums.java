import java.io.PrintWriter;
import java.util.Scanner;

public class CompareSums {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        float[] a = new float[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i]= in.nextFloat();
            (a[i] * 1000);
        }
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            float curr = in.nextFloat();
            b[i] = b[i - 1] + (int)(curr * 1000);
        }
        out.println(a[n]);
        out.println(b[n]);
//        float btot = (float) b[n]/1000;
//        float atot = (float) a[n]/1000;
        if (a[n] < b[n]) {
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
